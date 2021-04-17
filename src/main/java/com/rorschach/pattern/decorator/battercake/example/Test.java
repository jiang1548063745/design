package com.rorschach.pattern.decorator.battercake.example;

/**
 * @author Rorschach
 * @date 2021-4-13 22:26
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake;

        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);

        batterCake = new SausageDecorator(batterCake);

        System.out.println(batterCake.getMsg() + ", 总价" + batterCake.getPrice());
    }
}
