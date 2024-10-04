package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        String choice = sc.nextLine();
        System.out.println("Your choice: " + choice + "\n");
        if (Objects.equals(choice, "1")) {
            Cli.greetings();
        } else if (Objects.equals(choice, "2")) {
            Cli.greetings();
            Even.evenGame();
        }
    }
}
