package com.rorschach.pattern.interpreter.calculate;

import java.util.Stack;

/**
 * @author Rorschach
 * @date 2021-4-28 20:26
 */
public class Calculator {

    private Stack<IArithmeticInterpreter> stack = new Stack<>();

    public Calculator(String expression) {
        parse(expression);
    }

    /**
     * 100 + 200
     * @param expression 100 + 200
     */
    private void parse(String expression) {
        String[] elements = expression.split(" ");

        IArithmeticInterpreter left, right;

        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if (OperatorUtil.ifOperator(operator)) {
                left = this.stack.pop();
                right = new NumberInterpreter(Integer.parseInt(elements[++i]));
                System.out.println("出栈:" + left.interpreter() + " with " + right.interpreter());
                this.stack.push(OperatorUtil.getInterpreter(left, right, operator));

                System.out.println("应用运算符:" + operator);
            } else {
                NumberInterpreter numberInterpreter = new NumberInterpreter(Integer.parseInt(elements[i]));
                this.stack.push(numberInterpreter);
                System.out.println("入栈: " + numberInterpreter.interpreter());
            }
        }
    }

    public int calculate() {
        return this.stack.pop().interpreter();
    }
}
