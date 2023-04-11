package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int MAX_RANDOM_NUMBER = 30;

    public static int calculateGCD(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return firstNum;
        }
        return calculateGCD(secondNum, firstNum % secondNum);
    }
    public static String[] generateRoundData() {
        int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
        int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
        var questions = firstNum + " " + secondNum;
        var correctAnswer = String.valueOf(calculateGCD(firstNum, secondNum));
        return new String[] {questions, correctAnswer};
    }
    public static void startGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        var questionsAnswer = new String[Engine.QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAnswer[i] = generateRoundData();
        }
        Engine.launchGame(gameRules, questionsAnswer);
    }
}
