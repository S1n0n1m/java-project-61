package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 30;
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    private static final String[][] questionsAnswer = new String[QUESTIONS_COUNT][2];
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;

    public static void launchGcdGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);

            questionsAnswer[i][QUESTIONS_NUMBER] = firstNum + " " + secondNum;
            questionsAnswer[i][ANSWER_NUMBER] = String.valueOf(gcd(firstNum,secondNum));
        }
        Engine.launchGame(GAME_RULE, questionsAnswer);
    }

    public static int gcd(int firstNum, int secondNum) {
        if (secondNum == 0) return firstNum;
        return gcd(secondNum, firstNum % secondNum);
    }
}