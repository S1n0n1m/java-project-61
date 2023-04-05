package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final String[][] QUESTIONS_ANSWER = new String[QUESTIONS_COUNT][2];
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    public static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static int gcd(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return firstNum;
        }
        return gcd(secondNum, firstNum % secondNum);
    }
    public static void launchGcdGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);

            QUESTIONS_ANSWER[i][QUESTIONS_NUMBER] = firstNum + " " + secondNum;
            QUESTIONS_ANSWER[i][ANSWER_NUMBER] = String.valueOf(gcd(firstNum, secondNum));
        }
        Engine.launchGame(GAME_RULES, QUESTIONS_ANSWER);
    }
}
