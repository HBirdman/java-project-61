package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GDC {
    public static void game(int numberOfRounds) {
        String task = "Find the greatest common divisor of given numbers.";
        String[][] numbersAndAnswers = new String[2][numberOfRounds];
        final int numberRange = 100;
        for (var i = 0; i < numberOfRounds; i++) {
            int column = 0;
            int a = Util.randomNumber(numberRange);
            int b = Util.randomNumber(numberRange);
            int Answer = findGDC2(a, b);
            numbersAndAnswers[column][i] = a + " " + b;
            column++;
            numbersAndAnswers[column][i] = String.valueOf(Answer);
        }
        Engine.logic(task, numbersAndAnswers[0], numbersAndAnswers[1], numberOfRounds);
    }


    public static int findGDC2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGDC2(b, a % b);
    }
}
