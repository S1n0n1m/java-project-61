package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final String[][] questionsAnswer = new String[QUESTIONS_COUNT][2];
    private final static char[] MATH_OPERATORS = {'*', '-', '+'};
    private static final int QUESTIONS_NUMBER = 0;
    private static final int ANSWER_NUMBER = 1;
    public static void launchCalcGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int randomOperators = (int) (Math.random() * MATH_OPERATORS.length);
            char operator = MATH_OPERATORS[randomOperators];
            switch (operator) {
                case '*' -> questionsAnswer[i][QUESTIONS_NUMBER] = String.valueOf(firstNum * secondNum);
                case '-' -> questionsAnswer[i][QUESTIONS_NUMBER] = String.valueOf(firstNum - secondNum);
                case '+' -> questionsAnswer[i][QUESTIONS_NUMBER] = String.valueOf(firstNum + secondNum);
            }
            questionsAnswer[i][ANSWER_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.launchGame(GAME_RULE, questionsAnswer);
    }
}
