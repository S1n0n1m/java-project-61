package hexlet.code.games;

import hexlet.code.Engine;


public class EvenGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final String GAME_RULE = "Answer 'yes' in the number is even, otherwise answer 'no'";
    private static final String[][] questionsAnswer = new String[QUESTIONS_COUNT][2];
    private static final int QUESTIONS_NUMBER_ROW = 0;
    private static final int ANSWER_NUMBER_ROW = 1;

    public static void launchTheGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
            questionsAnswer[i][QUESTIONS_NUMBER_ROW] = String.valueOf(questionNumber);
            questionsAnswer[i][ANSWER_NUMBER_ROW] = (isEven(questionNumber)) ? "yes" : "no";
        }
        Engine.startGame(GAME_RULE, questionsAnswer);
    }
    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
