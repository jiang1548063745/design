package com.rorschach.pattern.state.order;

/**
 * 订单状态
 * @author Rorschach
 * @date 2021-4-22 22:10
 */
public enum OrderStatus {

    /** 待支付 */
    WAIT_PAYMENT,
    /** 待发货 */
    WAIT_DELIVER,
    /** 待收货 */
    WAIT_RECEIVE,
    /** 订单结束 */
    FINISH;
}
