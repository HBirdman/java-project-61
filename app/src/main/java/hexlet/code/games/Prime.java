package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static void game() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int numberRange = 20;
        String[][] numbersAndAnswers = new String[2][Engine.numberOfRounds];
        for (var i = 0; i < Engine.numberOfRounds; i++) {
            int column = 0;
            int number = Util.randomNumber(numberRange);
            numbersAndAnswers[column][i] = String.valueOf(number);
            column++;
            numbersAndAnswers[column][i] = isSimple(number);
        }
        Engine.logic(task, numbersAndAnswers[0], numbersAndAnswers[1]);
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
