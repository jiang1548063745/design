package com.rorschach.pattern.decorator.battercake.wrong;

/**
 * @author Rorschach
 * @date 2021-4-13 22:10
 */
public class BatterCakeWithEgg extends BatterCake{

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
