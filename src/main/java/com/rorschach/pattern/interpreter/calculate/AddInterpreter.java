package com.rorschach.pattern.interpreter.calculate;

/**
 * 加法
 * @author Rorschach
 * @date 2021-4-28 20:43
 */
public class AddInterpreter extends Interpreter{

    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() + right.interpreter();
    }
}
