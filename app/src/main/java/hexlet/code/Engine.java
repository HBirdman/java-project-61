package hexlet.code;

import java.util.Scanner;

public class Engine {
    static int count = 0;
    static int result = 0;
    static String name;
    public static void logic(String task, String[] question, String[] correctAnswer, int numberOfRounds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (var i = 0; i < numberOfRounds; i++) {
            System.out.println("Question: " + question[i]);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            System.out.println(answerChecker(correctAnswer[i], answer));
            if (result == 1) {
                break;
            }
        } if (count == numberOfRounds) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static String answerChecker(String correctAnswer, String answer) {
        if (correctAnswer.equalsIgnoreCase(answer)) {
            count++;
            return "Correct!";
        } else {
            return ("'" + answer + "' is wrong answer ;(. "
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + Engine.name + "!");
        }
    }
}
