package com.venky;

import java.util.UUID;

/**
 * @author huwk
 * @date 2019/7/19
 **/
public class Test {

    public static void main(String[] args) {
        Integer freezeReason = 2;

        int freezeReasonType = 0;
        if (freezeReason != null && freezeReason != 0) {
            freezeReasonType = freezeReason;
            System.out.println(freezeReasonType);

            UUID uuid = UUID.randomUUID();

            System.out.println(uuid);

            System.out.println(uuid.toString().substring(24, 36));
        }



    }
}
