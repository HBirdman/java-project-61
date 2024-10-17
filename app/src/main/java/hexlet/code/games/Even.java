package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void game() {
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int evenRange = 100;
        String[][] numbersAndAnswers = new String[2][Engine.getNumberOfRounds()];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int column = 0;
            int number = Util.randomNumber(evenRange);
            numbersAndAnswers[column][i] = String.valueOf(number);
            column++;
            numbersAndAnswers[column][i] = getCorrectAnswer(number);
        }
        Engine.logic(task, numbersAndAnswers[0], numbersAndAnswers[1]);
    }

    public static String getCorrectAnswer(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
