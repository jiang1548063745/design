package com.rorschach.pattern.interpreter.calculate;

/**
 * 非终结表达式
 * @author Rorschach
 * @date 2021-4-28 20:40
 */
public abstract class Interpreter implements IArithmeticInterpreter {

    protected IArithmeticInterpreter left;

    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
