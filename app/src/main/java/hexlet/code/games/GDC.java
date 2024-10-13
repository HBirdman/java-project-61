package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GDC {
    public static void game(int numberOfRounds) {
        String task = "Find the greatest common divisor of given numbers.";
        String[][] numbersAndAnswers = new String[2][numberOfRounds];
        for (var i = 0; i < numberOfRounds; i++) {
            int column = 0;
            String[] numberAndAnswer = findGDC();
            numbersAndAnswers[column][i] = numberAndAnswer[column];
            column++;
            numbersAndAnswers[column][i] = numberAndAnswer[column];
        }
        Engine.logic(task, numbersAndAnswers[0], numbersAndAnswers[1], numberOfRounds);
    }

    public static String[] findGDC() {
        int numberRange = 100;
        int a = Util.randomNumber(numberRange);
        int b = Util.randomNumber(numberRange);
        String expression = a + " " + b;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        int answer = a + b;
        return new String[]{expression, String.valueOf(answer)};
    }
}
