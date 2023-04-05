package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int selectionGame = scanner.nextInt();

        switch (selectionGame) {
            case 1 -> Cli.greeting();
            case 2 -> EvenGame.launchEvenGame();
            case 3 -> CalcGame.launchCalcGame();
            case 4 -> GcdGame.launchGcdGame();
            case 5 -> ProgressionGame.launchProgressionGame();
            case 6 -> PrimeGame.launchPrimeGame();
            case 0 -> System.out.println("Bye!");
            default -> throw new IllegalStateException("Unexpected value: " + selectionGame);
        }
    }
}
