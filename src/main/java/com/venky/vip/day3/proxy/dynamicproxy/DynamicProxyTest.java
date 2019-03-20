package com.venky.vip.day3.proxy.dynamicproxy;

import com.venky.vip.day3.proxy.staticproxy.Person;
import com.venky.vip.day3.proxy.staticproxy.Tenant;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * 动态代理测试
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new JdkAgency().getInstance(new Lessee());
        person.findFlat();

        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Person tenant = (Person) new JdkAgency().getInstance(new Tenant());
        tenant.findFlat();
    }
}
