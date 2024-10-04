package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        var count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if even, otherwise 'no'.");
        while (count < 3) {
            var correctAnswer = "";
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            } if (correctAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        } if (count == 3) {
            System.out.println("Congatulations, " + name + "!");
        }
    }
}