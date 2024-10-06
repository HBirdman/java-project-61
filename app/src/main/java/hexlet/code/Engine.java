package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void logic(String task, String[] question, String[] correctAnswer) {
        var count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (var i = 0; i < 3; i++) {
            System.out.println("Question: " + question[i]);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (correctAnswer[i].equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        } if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}