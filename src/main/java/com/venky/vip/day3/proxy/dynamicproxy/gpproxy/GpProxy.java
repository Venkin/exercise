package com.venky.vip.day3.proxy.dynamicproxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来生产代码的工具类类
 *
 * @author Venkin
 * @date 2019/3/19
 **/
public class GpProxy {

    public static final String ln = "\t\n";

    public static Object newProxyInstance(GpClassLoader classLoader, Class<?>[] interfaces, GpInvocationHandler h) {

        try {
            // 1、动态生成源代码 .java文件
            String src = generateSrc(interfaces);

            System.out.println(src);
            // 2、java文件刘输出磁盘
            String filePath = GpProxy.class.getResource("").getPath();

            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);

            fw.write(src);
            fw.flush();
            fw.close();

            // 3、编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 4、.class加载到JVM中
            Class proxyClass = classLoader.findClass("$Proxy0");


            Constructor c = proxyClass.getConstructor(GpInvocationHandler.class);
            f.delete();

            // 5、返回字节码重组以后的新代理对象

            return c.newInstance(h);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.venky.vip.day3.proxy.dynamicproxy.gpproxy;" + ln);
        sb.append("import com.venky.vip.day3.proxy.staticproxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("GpInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GpInvocationHandler h) {" + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);

        for (Method m : interfaces[0].getMethods()) {
            Class<?>[] params = m.getParameterTypes();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for (int i = 0; i < params.length; i++) {
                Class<?> clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if (i > 0 && i < params.length - 1) {
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + ln);
            sb.append("try { " + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + ln);
            sb.append((hasReturnValue(m.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})", m.getReturnType()) + ";" + ln);
            sb.append("} catch(Error _e) {}");
            sb.append("catch(Throwable e){" + ln);
            sb.append("throw new UndeclaredThrowableException(e);" + ln);
            sb.append("}");
            sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}");
        }
        sb.append("}");

        return sb.toString();
    }

    private static Map<Class, Class> mappings = new HashMap<>();

    static {
        mappings.put(int.class, Integer.class);
    }


    private static String getCaseCode(String code, Class<?> returnClass) {

        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static String getReturnEmptyCode(Class<?> returnType) {
        if (mappings.containsKey(returnType)) {
            return "return 0;";
        } else if (returnType == void.class) {
            return "";
        } else {
            return "return null";
        }
    }

    /**
     * 判断方法是否有返回值
     *
     * @param returnType
     * @return
     */
    private static boolean hasReturnValue(Class<?> returnType) {
        return returnType != void.class;
    }

    /**
     * 首字母变小
     *
     * @param simpleName
     * @return
     */
    private static String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }


}
