package com.rorschach.pattern.interpreter.calculate;

/**
 * 终结表达式
 * @author Rorschach
 * @date 2021-4-28 20:37
 */
public class NumberInterpreter implements IArithmeticInterpreter{

    private int value;

    public NumberInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return this.value;
    }
}
