package com.venky.vip.day3.proxy.dbroute;

/**
 * 定单服务实现层
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        //如果使用spring应该是自动注入的
        //为了方便，在构造方法中将orderDao直接初始化
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl 调用了orderDao创建了定单");
        return orderDao.insert(order);
    }
}
