package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int MAX_RANDOM_NUMBER = 10;
    public static String[] generateRoundsData() {
        char[] mathOperators = {'*', '-', '+'};
        int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
        int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER - 1);
        int randomOperators = (int) (Math.random() * mathOperators.length);
        char operator = mathOperators[randomOperators];
        int answer = calculateAnswer(firstNum, secondNum, operator);
        var correctAnswer = String.valueOf(answer);
        var questions = firstNum + " " + operator + " " + secondNum;
        return new String[] {questions, correctAnswer};
    }
    public static int calculateAnswer(int firstNum, int secondNum, char operator) {
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

        return answer;
    }
    public static void startGame() {
        String gameRules = "What is the result of the expression?";
        var questionsAnswer = new String[Engine.QUESTIONS_COUNT][2];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAnswer[i] = generateRoundsData();
        }
        Engine.launchGame(gameRules, questionsAnswer);
    }
}
