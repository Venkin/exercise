package com.venky.vip.day3.prototype.deep;

/**
 * 深克隆测试
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class DeepCloneTest {

    public static void main(String[] args) {

        try {
            QITianDaSheng qiTianDaSheng = new QITianDaSheng();
            QITianDaSheng qiTianDaShengDeep = (QITianDaSheng) qiTianDaSheng.clone();

            System.out.println(qiTianDaSheng);
            System.out.println(qiTianDaShengDeep);
            System.out.println(qiTianDaSheng.goldenMagicStick == qiTianDaShengDeep.goldenMagicStick);

            QITianDaSheng qiTianDaShengShadow = qiTianDaSheng.shadowCopy();

            System.out.println(qiTianDaShengShadow);

            System.out.println(qiTianDaSheng.goldenMagicStick == qiTianDaShengShadow.goldenMagicStick);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
