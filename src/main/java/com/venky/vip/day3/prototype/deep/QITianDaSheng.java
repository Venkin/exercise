package com.venky.vip.day3.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * 齐天大圣实体
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class QITianDaSheng extends Monkey implements Cloneable,Serializable {

    GoldenMagicStick goldenMagicStick;

    public QITianDaSheng() {
        this.birthday  = new Date();
        this.goldenMagicStick = new GoldenMagicStick();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QITianDaSheng qiTianDaSheng = (QITianDaSheng) ois.readObject();

            qiTianDaSheng.birthday = new Date();
            return qiTianDaSheng;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public QITianDaSheng shadowCopy() {
        QITianDaSheng qiTianDaSheng = new QITianDaSheng();
        qiTianDaSheng.height = this.height;
        qiTianDaSheng.birthday = this.birthday;
        qiTianDaSheng.weight = this.weight;
        qiTianDaSheng.goldenMagicStick = this.goldenMagicStick;
        return qiTianDaSheng;
    }
}
