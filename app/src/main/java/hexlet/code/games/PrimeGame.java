package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String[][] QUESTIONS_ANSWER = new String[Engine.QUESTIONS_COUNT][2];

    public static void startGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
            QUESTIONS_ANSWER[i][Engine.QUESTIONS_NUMBER] = String.valueOf(questionNumber);
            QUESTIONS_ANSWER[i][Engine.ANSWER_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
        }
        Engine.launchGame(gameRules, QUESTIONS_ANSWER);
    }

    public static boolean isPrime(int currentNumber) {
        if (currentNumber < 2) {
            return false;
        }
        for (int i = 2; i < currentNumber / 2; i++) {
            if (currentNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}

