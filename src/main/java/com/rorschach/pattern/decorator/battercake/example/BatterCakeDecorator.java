package com.rorschach.pattern.decorator.battercake.example;

/**
 * @author Rorschach
 * @date 2021-4-13 22:19
 */
public class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return batterCake.getPrice();
    }
}
