package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        final int evenRange = 100;
        String[][] numbersAndAnswers = new String[Engine.getNumberOfRounds()][2];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int number = Util.randomNumber(evenRange);
            numbersAndAnswers[i][0] = String.valueOf(number);
            numbersAndAnswers[i][1] = getCorrectAnswer(number);
        }
        Engine.logic(task, numbersAndAnswers);
    }

    public static String getCorrectAnswer(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
