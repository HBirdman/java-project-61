package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void game() {
        var greeting = "Welcome to the Brain Games!";
        System.out.println(greeting);
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
