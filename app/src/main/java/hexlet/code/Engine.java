package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_ROUNDS = 3;

    public static int getNumberOfRounds() {
        return NUMBER_OF_ROUNDS;
    }

    public static void logic(String task, String[][] questionAndAnswer) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.print("Question: " + questionAndAnswer[i][0] + "\nYour answer: ");
            String answer = sc.nextLine();
            answerChecker(questionAndAnswer[i][1], answer, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void answerChecker(String correctAnswer, String answer, String name) {
        if (correctAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. "
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + name + "!");
            System.exit(0);
        }

    }
}
