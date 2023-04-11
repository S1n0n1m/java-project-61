package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    private static final int MAX_RANDOM_NUMBER = 100;
    public static String[] generateRoundData() {
        int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
        var questions = String.valueOf(questionNumber);
        var correctAnswer = isPrime(questionNumber) ? "yes" : "no";
        return new String[] {questions, correctAnswer};
    }
    public static void startGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var questionsAnswer = new String[Engine.QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAnswer[i] = generateRoundData();
        }
        Engine.launchGame(gameRules, questionsAnswer);
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

