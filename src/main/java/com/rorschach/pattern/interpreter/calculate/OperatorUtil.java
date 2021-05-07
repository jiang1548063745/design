package com.rorschach.pattern.interpreter.calculate;

/**
 * @author Rorschach
 * @date 2021-4-28 20:51
 */
public class OperatorUtil {

    private OperatorUtil() {
    }

    public static boolean ifOperator(String symbol) {
        return "+".equals(symbol) || "-".equals(symbol) || "*".equals(symbol) || "/".equals(symbol);
    }

    public static Interpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String symbol) {
        switch (symbol) {
            case "+":
                return new AddInterpreter(left, right);
            case "-":
                return new SubInterpreter(left, right);
            case "*":
                return new MultiInterpreter(left, right);
            case "/":
                return new DivInterpreter(left, right);
            default:
                return null;
        }
    }
}
