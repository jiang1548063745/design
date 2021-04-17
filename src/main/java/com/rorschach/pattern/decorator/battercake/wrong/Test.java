package com.rorschach.pattern.decorator.battercake.wrong;

/**
 * @author Rorschach
 * @date 2021-4-13 22:08
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();

        System.out.println(batterCake.getMsg() + ",总价" + batterCake.getPrice() );
    }
}
