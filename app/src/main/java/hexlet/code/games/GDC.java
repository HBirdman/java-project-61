package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GDC {
    private static final String task = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] numbersAndAnswers = new String[Engine.getNumberOfRounds()][2];
        final int numberRange = 100;
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int a = Util.randomNumber(numberRange);
            int b = Util.randomNumber(numberRange);
            int answer = findGDC2(a, b);
            numbersAndAnswers[i][0] = a + " " + b;
            numbersAndAnswers[i][1] = String.valueOf(answer);
        }
        Engine.logic(task, numbersAndAnswers);
    }


    public static int findGDC2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGDC2(b, a % b);
    }
}
