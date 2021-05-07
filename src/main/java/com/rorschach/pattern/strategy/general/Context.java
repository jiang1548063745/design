package com.rorschach.pattern.strategy.general;

/**
 * @author Rorschach
 * @date 2021-4-20 20:17
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
