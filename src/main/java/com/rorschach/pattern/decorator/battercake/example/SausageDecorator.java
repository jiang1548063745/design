package com.rorschach.pattern.decorator.battercake.example;

/**
 * @author Rorschach
 * @date 2021-4-13 22:24
 */
public class SausageDecorator extends BatterCakeDecorator{

    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
