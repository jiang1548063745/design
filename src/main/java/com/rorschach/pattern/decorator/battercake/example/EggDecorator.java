package com.rorschach.pattern.decorator.battercake.example;

/**
 * @author Rorschach
 * @date 2021-4-13 22:23
 */
public class EggDecorator extends BatterCakeDecorator{

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
