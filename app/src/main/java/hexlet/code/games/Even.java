package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void evenGame() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var number1 = generateNumber();
        var answer1 = getCorrectAnswer(number1);
        var number2 = generateNumber();
        var answer2 = getCorrectAnswer(number2);
        var number3 = generateNumber();
        var answer3 = getCorrectAnswer(number3);
        String[] numbers = {Integer.toString(number1), Integer.toString(number2), Integer.toString(number3)};
        String[] answers = {answer1, answer2, answer3};
        Engine.logic(task, numbers, answers);
    }

    public static int generateNumber() {
        final int evenRange = 100;
        return (int) (Math.random() * evenRange);
    }

    public static String getCorrectAnswer(int randomNumber) {
        var correctAnswer = "";
        if (randomNumber % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return correctAnswer;
    }
}
