package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final String[][] QUESTIONS_ANSWER = new String[QUESTIONS_COUNT][2];
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    public static final String GAME_RULES = "What is the result of the expression?";

    public static void launchCalcGame() {
        char[] mathOperators = {'*', '-', '+'};
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int randomOperators = (int) (Math.random() * mathOperators.length);
            char operator = mathOperators[randomOperators];
            int answer;
            switch (operator) {
                case '*' -> answer = firstNum * secondNum;
                case '-' -> answer = firstNum - secondNum;
                case '+' -> answer = firstNum + secondNum;
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            }
            QUESTIONS_ANSWER[i][ANSWER_NUMBER] = String.valueOf(answer);
            QUESTIONS_ANSWER[i][QUESTIONS_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.launchGame(GAME_RULES, QUESTIONS_ANSWER);
    }
}
