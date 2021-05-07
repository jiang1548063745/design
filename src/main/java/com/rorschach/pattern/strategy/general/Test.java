package com.rorschach.pattern.strategy.general;

/**
 * @author Rorschach
 * @date 2021-4-20 20:18
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.algorithm();
    }
}
