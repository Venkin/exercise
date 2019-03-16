package com.venky.vip.day2.serializable;

import java.io.Serializable;

/**
 * 反序列化可以破坏单例
 */
public class SerializableSingleton implements Serializable {

    /**
     * 序列化就是把内存的状态通过转换成字节码的形式
     * 从而转换成另一种IO流，写入到其他的地方，可以是磁盘，网络IO
     * 从而将内存的状态永久的保存下来。
     *
     * 反序列化
     * 将已经持久化的字节码内容转换为IO流的过程
     * 通过IO流的读取，将读取的内容转换为Java对象，并重新创建对象的国创。
     */
    public final static SerializableSingleton SINGLETON =  new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return SINGLETON;
    }

    private Object readResolve() {
        return SINGLETON;
    }

}
