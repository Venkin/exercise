package com.venky.vip.day2.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反序列化破坏单例的案例
 */
public class SerializableSingletonTest {

    public static void main(String[] args) {

        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        FileOutputStream fos = null;

        try {
            // 序列化过程
            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s2);
            oos.flush();
            oos.close();

            // 反序列化过程
            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);

            s1 = (SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
