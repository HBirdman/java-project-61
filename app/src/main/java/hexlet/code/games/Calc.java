package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Calc {
    public static void game(int numberOfRounds) {
        String task = "What is the result of the expression?";
        String[][] expressionsAndAnswers = new String[2][numberOfRounds];
        for (var i = 0; i < numberOfRounds; i++) {
            int column = 0;
            String operator = generateOperator();
            String[] expressionAndAnswer = construct(operator);
            expressionsAndAnswers[column][i] = expressionAndAnswer[column];
            column++;
            expressionsAndAnswers[column][i] = expressionAndAnswer[column];
        }
        Engine.logic(task, expressionsAndAnswers[0], expressionsAndAnswers[1], numberOfRounds);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        return operators[random.nextInt(operators.length)];
    }

    public static String[] construct(String operator) {
        String[] result = new String[2];
        final int calcRange = 20;
        if (operator.equalsIgnoreCase("+")) {
            int operand1 = Util.randomNumber(calcRange);
            int operand2 = Util.randomNumber(calcRange);
            String expression = operand1 + " + " + operand2;
            int answer = operand1 + operand2;
            result = new String[]{expression, Integer.toString(answer)};
        } else if (operator.equalsIgnoreCase("-")) {
            int operand1 = Util.randomNumber(calcRange);
            int operand2 = Util.randomNumber(calcRange);
            String expression = operand1 + " - " + operand2;
            int answer = operand1 - operand2;
            result = new String[]{expression, Integer.toString(answer)};
        } else if (operator.equalsIgnoreCase("*")) {
            int operand1 = Util.randomNumber(calcRange);
            int operand2 = Util.randomNumber(calcRange);
            String expression = operand1 + " * " + operand2;
            int answer = operand1 * operand2;
            result = new String[]{expression, Integer.toString(answer)};
        }
        return result;
    }
}
