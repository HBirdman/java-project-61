package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Calc {
    public static void game() {
        String task = "What is the result of the expression?";
        String[][] expressionsAndAnswers = new String[Engine.getNumberOfRounds()][2];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            String operator = generateOperator();
            String[] expressionAndAnswer = construct(operator);
            expressionsAndAnswers[i][0] = expressionAndAnswer[0];
            expressionsAndAnswers[i][1] = expressionAndAnswer[1];
        }
        Engine.logic(task, expressionsAndAnswers);
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        return operators[random.nextInt(operators.length)];
    }

    public static String[] construct(String operator) {
        final int calcRange = 20;
        int operand1 = Util.randomNumber(calcRange);
        int operand2 = Util.randomNumber(calcRange);
        int answer;
        String expression = operand1 + " " + operator + " " + operand2;
        return switch (operator) {
            case "+" -> {
                answer = operand1 + operand2;
                yield new String[]{expression, Integer.toString(answer)};
            }
            case "-" -> {
                answer = operand1 - operand2;
                yield new String[]{expression, Integer.toString(answer)};
            }
            case "*" -> {
                answer = operand1 * operand2;
                yield new String[]{expression, Integer.toString(answer)};
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
