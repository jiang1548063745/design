package com.rorschach.pattern.state.order;

/**
 * 订单状态改变事件
 * @author Rorschach
 * @date 2021-4-22 22:14
 */
public enum OrderStatusChangeEvent {

    /** 支付 */
    PAYED,
    /** 发货 */
    DELIVERY,
    /** 确认收货 */
    RECEIVED
}
