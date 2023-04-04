package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void launchGame(String GAME_RULE, String[][] questionsAnswer) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(GAME_RULE);

        for (String[] strings : questionsAnswer) {
            String correctAnswer = strings[1];
            System.out.println("Questions: " + strings[0]);
            System.out.print("Your answer: ");
            var currentAnswer = console.nextLine();
            boolean isAnswerCorrect = currentAnswer.equals(correctAnswer);
            if (isAnswerCorrect) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'." + "Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username);
    }
}
