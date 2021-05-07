package com.rorschach.pattern.interpreter.calculate;

/**
 * 乘法
 * @author Rorschach
 * @date 2021-4-28 20:46
 */
public class MultiInterpreter extends Interpreter{
    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() * right.interpreter();
    }
}
