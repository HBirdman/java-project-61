package hexlet.code;

import java.util.Scanner;

public class Engine {
    private int count = 0;
    private int result = 0;
    private String name;

    Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void changeResult() {
        this.result++;
    }

    public int getResult() {
        return result;
    }

    public void addCount() {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public static void logic(String task, String[] question, String[] correctAnswer, int numberOfRounds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        var user = new Engine(sc.nextLine());
        System.out.println("Hello, " + user.getName() + "!");
        System.out.println(task);
        for (var i = 0; i < numberOfRounds; i++) {
            System.out.println("Question: " + question[i]);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            System.out.println(answerChecker(correctAnswer[i], answer, user));
            if (user.getResult() == 1) {
                break;
            }
        } if (user.getCount() == numberOfRounds) {
            System.out.println("Congratulations, " + user.getName() + "!");
        }
    }

    public static String answerChecker(String correctAnswer, String answer, Engine user) {
        if (correctAnswer.equalsIgnoreCase(answer)) {
            user.addCount();
            return "Correct!";
        } else {
            user.changeResult();
            return ("'" + answer + "' is wrong answer ;(. "
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + user.getName() + "!");
        }
    }
}
