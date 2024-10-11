package hexlet.code.games;

import hexlet.code.Engine;

public class GDC {
    public static void gdcGame() {
        var task = "Find the greatest common divisor of given numbers.";
        var numbersAndAnswer1 = findGDC();
        var numbersAndAnswer2 = findGDC();
        var numbersAndAnswer3 = findGDC();
        var numbers = new String[]{numbersAndAnswer1[0], numbersAndAnswer2[0], numbersAndAnswer3[0]};
        var answers = new String[]{numbersAndAnswer1[1], numbersAndAnswer2[1], numbersAndAnswer3[1]};
        Engine.logic(task, numbers, answers);
    }

    public static int generateNumber() {
        var numbersRange = 100;
        return (int) (Math.random() * numbersRange);
    }

    public static String[] findGDC() {
        var a = generateNumber();
        var b = generateNumber();
        var expression = a + " " + b;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        var answer = a + b;
        return new String[]{expression, String.valueOf(answer)};
    }
}
