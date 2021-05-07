package com.rorschach.pattern.interpreter.calculate;

/**
 * @author Rorschach
 * @date 2021-4-28 20:47
 */
public class DivInterpreter extends Interpreter{
    public DivInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() / right.interpreter();
    }
}
