package hexlet.code.games;

import hexlet.code.Engine;


public class EvenGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final String[][] QUESTIONS_ANSWER = new String[QUESTIONS_COUNT][2];
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    private static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void launchEvenGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
            QUESTIONS_ANSWER[i][QUESTIONS_NUMBER] = String.valueOf(questionNumber);
            QUESTIONS_ANSWER[i][ANSWER_NUMBER] = (isEven(questionNumber)) ? "yes" : "no";
        }
        Engine.launchGame(GAME_RULES, QUESTIONS_ANSWER);
    }
    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
