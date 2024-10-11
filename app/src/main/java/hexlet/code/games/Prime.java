package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var number1 = generateNumber();
        var answer1 = isSimple(number1);
        var number2 = generateNumber();
        var answer2 = isSimple(number2);
        var number3 = generateNumber();
        var answer3 = isSimple(number3);
        String[] numbers = {String.valueOf(number1), String.valueOf(number2), String.valueOf(number3)};
        String[] answers = {answer1, answer2, answer3};
        Engine.logic(task, numbers, answers);
    }

    public static int generateNumber() {
        var numberRange = 20;
        return (int) (Math.random() * numberRange);
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
