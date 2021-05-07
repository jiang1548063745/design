package com.rorschach.pattern.state.order;

/**
 * 订单
 * @author Rorschach
 * @date 2021-4-22 22:10
 */
public class Order {

    /** 订单ID */
    private int id;

    private OrderStatus orderStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
