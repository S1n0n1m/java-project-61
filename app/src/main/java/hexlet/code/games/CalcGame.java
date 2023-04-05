package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final String[][] QUESTIONS_ANSWER = new String[QUESTIONS_COUNT][2];
    private final static char[] MATH_OPERATORS = {'*', '-', '+'};
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    public static void launchCalcGame() {
        String gameRules = "What is the result of the expression?";
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int randomOperators = (int) (Math.random() * MATH_OPERATORS.length);
            char operator = MATH_OPERATORS[randomOperators];
            switch (operator) {
                case '*' -> QUESTIONS_ANSWER[i][ANSWER_NUMBER] = String.valueOf(firstNum * secondNum);
                case '-' -> QUESTIONS_ANSWER[i][ANSWER_NUMBER] = String.valueOf(firstNum - secondNum);
                case '+' -> QUESTIONS_ANSWER[i][ANSWER_NUMBER] = String.valueOf(firstNum + secondNum);
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            }
            QUESTIONS_ANSWER[i][QUESTIONS_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.launchGame(gameRules, QUESTIONS_ANSWER);
    }
}
