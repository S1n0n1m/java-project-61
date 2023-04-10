package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final String[][] QUESTIONS_ANSWER = new String[Engine.QUESTIONS_COUNT][2];

    public static int gcd(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return firstNum;
        }
        return gcd(secondNum, firstNum % secondNum);
    }

    public static void startGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);

            QUESTIONS_ANSWER[i][Engine.QUESTIONS_NUMBER] = firstNum + " " + secondNum;
            QUESTIONS_ANSWER[i][Engine.ANSWER_NUMBER] = String.valueOf(gcd(firstNum, secondNum));
        }
        Engine.launchGame(gameRules, QUESTIONS_ANSWER);
    }
}
