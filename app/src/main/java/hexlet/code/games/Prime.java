package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        final int numberRange = 20;
        String[][] numbersAndAnswers = new String[Engine.getNumberOfRounds()][2];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int number = Util.randomNumber(numberRange);
            numbersAndAnswers[i][0] = String.valueOf(number);
            numbersAndAnswers[i][1] = isSimple(number);
        }
        Engine.logic(task, numbersAndAnswers);
    }


    public static String isSimple(Integer number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
