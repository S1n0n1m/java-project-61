package hexlet.code.games;

import hexlet.code.Engine;


public class ProgressionGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MIN = 0;
    private static final int MAX = 50;
    private static final int MAX_STEP = 5;
    private static final String[][] QUESTIONS_ANSWER = new String[QUESTIONS_COUNT][2];
    private static final int PROGRESSION_LENGTH = 8;
    public static final String GAME_RULES = "What number is missing in the progression?";
    public static void launchProgressionGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            var step = randomGenerator(MIN, MAX_STEP);
            var firstNumber = randomGenerator(MIN, MAX);
            int hiddenNumber = randomGenerator(0, PROGRESSION_LENGTH - 1);
            String[] progression = generateProgression(firstNumber, step, PROGRESSION_LENGTH);
            var correctAnswer = progression[hiddenNumber];
            progression[hiddenNumber] = "..";
            var questions = String.join(" ", progression);
            QUESTIONS_ANSWER[i] = new String[] {questions, correctAnswer};
        }
        Engine.launchGame(GAME_RULES, QUESTIONS_ANSWER);
    }

    public static String[] generateProgression(int number, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(number);
            number += step;
        }
        return progression;
    }
    public static int randomGenerator(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}

