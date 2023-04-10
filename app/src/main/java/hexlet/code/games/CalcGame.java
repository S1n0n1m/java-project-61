package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final String[][] QUESTIONS_ANSWER = new String[Engine.QUESTIONS_COUNT][2];

    public static void startGame() {
        String gameRules = "What is the result of the expression?";
        char[] mathOperators = {'*', '-', '+'};
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
            int randomOperators = (int) (Math.random() * mathOperators.length);
            char operator = mathOperators[randomOperators];
            int answer;
            switch (operator) {
                case '*':
                    answer = firstNum * secondNum;
                    break;
                case '-':
                    answer = firstNum - secondNum;
                    break;
                case '+':
                    answer = firstNum + secondNum;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + operator);
            }
            QUESTIONS_ANSWER[i][Engine.ANSWER_NUMBER] = String.valueOf(answer);
            QUESTIONS_ANSWER[i][Engine.QUESTIONS_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.launchGame(gameRules, QUESTIONS_ANSWER);
    }
}
