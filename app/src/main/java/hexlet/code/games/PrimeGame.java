package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class PrimeGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String[][] QUESTIONS_ANSWER = new String[QUESTIONS_COUNT][2];
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    public static void launchPrimeGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = Utils.randomGenerator(1, MAX_RANDOM_NUMBER);
            QUESTIONS_ANSWER[i][QUESTIONS_NUMBER] = String.valueOf(questionNumber);
            QUESTIONS_ANSWER[i][ANSWER_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
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

