package com.venky.vip.day2.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 注册式单例
 *
 * @author huwk
 * @date 2019/3/17
 */
public class RegisterSingletonTest {

    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        FileOutputStream fos = null;

        try {
            // 序列化过程
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s2);
            oos.flush();
            oos.close();

            // 反序列化过程
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);

            s1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
