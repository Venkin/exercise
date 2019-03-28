package com.venky.vip.day4.strategy.promotion;

/**
 * 策略模式测试
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class PromotionStrategyTest {

    public static void main(String[] args) {

        PromotionActivity activity618 = new PromotionActivity(new CoupanStrategy());

        PromotionActivity activity1111 = new PromotionActivity(new CashbackStategy());



        activity618.execute();
        activity1111.execute();


        // 一般会动态的选择使用哪一种策略
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if ("COUPON".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CoupanStrategy());
        } else if ("CASHBACK".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CashbackStategy());
        }
        // .........
        promotionActivity.execute();

        // 再次产生了大量的if-else判断
        // 重构后的代码
        String key = "GROUPBUY";
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(key));
        activity.execute();



    }
}
