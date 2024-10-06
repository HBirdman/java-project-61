package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calcGame() {
        var task = "What is the result of the expression?";
        var operator1 = generateOperator();
        var expressionAndAnswer1 = construct(operator1);
        var operator2 = generateOperator();
        var expressionAndAnswer2 = construct(operator2);
        var operator3 = generateOperator();
        var expressionAndAnswer3 = construct(operator3);
        String[] expressions = {expressionAndAnswer1[0], expressionAndAnswer2[0], expressionAndAnswer3[0]};
        String[] answers = {expressionAndAnswer1[1], expressionAndAnswer2[1], expressionAndAnswer3[1]};
        Engine.logic(task, expressions, answers);
    }

    public static int generateNumber() {
        return (int) (Math.random() * 20);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        return operators[random.nextInt(operators.length)];
    }

    public static String[] construct(String operator) {
        String[] result = new String[2];
        if (operator.equalsIgnoreCase("+")) {
            var operand1 = generateNumber();
            var operand2 = generateNumber();
            var expression = operand1 + " + " + operand2;
            var answer = operand1 + operand2;
            result = new String[]{expression, Integer.toString(answer)};
        } else if (operator.equalsIgnoreCase("-")) {
            var operand1 = generateNumber();
            var operand2 = generateNumber();
            var expression = operand1 + " - " + operand2;
            var answer = operand1 - operand2;
            result = new String[]{expression, Integer.toString(answer)};
        } else if (operator.equalsIgnoreCase("*")) {
            var operand1 = generateNumber();
            var operand2 = generateNumber();
            var expression = operand1 + " * " + operand2;
            var answer = operand1 * operand2;
            result = new String[]{expression, Integer.toString(answer)};
        }
        return result;
    }
}
