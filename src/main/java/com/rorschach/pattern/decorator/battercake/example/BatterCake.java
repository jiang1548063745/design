package com.rorschach.pattern.decorator.battercake.example;

/**
 * @author Rorschach
 * @date 2021-4-13 22:14
 */
public abstract class BatterCake {

    /**
     * 获取信息
     * @return 信息
     */
    protected abstract String getMsg();

    /**
     * 获取价格
     * @return 价格
     */
    protected abstract int getPrice();
}
