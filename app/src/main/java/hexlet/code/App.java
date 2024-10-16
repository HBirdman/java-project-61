package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GDC;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
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
                6 - Prime
                0 - Exit""");
        String choice = sc.nextLine();
        System.out.println("Your choice: " + choice + "\n");
        switch (choice) {
            case "1":
                Cli.game();
                break;
            case "2":
                Even.game();
                break;
            case "3":
                Calc.game();
                break;
            case "4":
                GDC.game();
                break;
            case "5":
                Progression.game();
                break;
            case "6":
                Prime.game();
                break;
            default:
                break;
        }
    }
}
