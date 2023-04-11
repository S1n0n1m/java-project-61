package hexlet.code.games;

import hexlet.code.Engine;


public class EvenGame {
    private static final int MAX_RANDOM_NUMBER = 30;
    public static String[] generateRoundsData() {
        int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
        var questions = String.valueOf(questionNumber);
        var correctAnswer = isEven(questionNumber) ? "yes" : "no";
        return new String[] {questions, correctAnswer};
    }
    public static void startGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var QUESTIONS_ANSWER = new String[Engine.QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            QUESTIONS_ANSWER[i] = generateRoundsData();
        }
        Engine.launchGame(gameRules, QUESTIONS_ANSWER);
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
