package hexlet.code.games;

import hexlet.code.Engine;


public class EvenGame {
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final String[][] QUESTIONS_ANSWER = new String[Engine.QUESTIONS_COUNT][2];

    public static void startGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
            QUESTIONS_ANSWER[i][Engine.QUESTIONS_NUMBER] = String.valueOf(questionNumber);
            QUESTIONS_ANSWER[i][Engine.ANSWER_NUMBER] = (isEven(questionNumber)) ? "yes" : "no";
        }
        Engine.launchGame(gameRules, QUESTIONS_ANSWER);
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
