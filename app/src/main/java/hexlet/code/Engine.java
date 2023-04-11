package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS_COUNT = 3;
    public static final int QUESTIONS_NUMBER = 0;
    public static final int ANSWER_NUMBER = 1;

    public static void launchGame(String gameRules, String[][] questionsAnswer) {
        Scanner console = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(gameRules);

        for (String[] strings : questionsAnswer) {
            String correctAnswer = strings[ANSWER_NUMBER];
            System.out.println("Question: " + strings[QUESTIONS_NUMBER]);
            System.out.print("Your answer: ");
            var currentAnswer = console.nextLine();
            if (!currentAnswer.equals(correctAnswer)) {
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'." + " Let's try again, " + username + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
