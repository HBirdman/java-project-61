package hexlet.code;

import hexlet.code.games.*;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                
                1 - Greet
                2 - Even
                3 - Calc
                4 - GDC
                5 - Progression
                0 - Exit""");
        String choice = sc.nextLine();
        System.out.println("Your choice: " + choice + "\n");
        if (Objects.equals(choice, "1")) {
            Cli.greetings();
        } else if (Objects.equals(choice, "2")) {
            Cli.greetings();
            Even.evenGame();
        } else if (Objects.equals(choice, "3")) {
            Cli.greetings();
            Calc.calcGame();
        } else if (Objects.equals(choice, "4")) {
            Cli.greetings();
            GDC.gdcGame();
        } else if (Objects.equals(choice, "5")) {
            Cli.greetings();
            Progression.gameProgression();
        }
    }
}
