package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final String task = "What number is missing in the progression?";

    public static void game() {
        String[][] progressionsAndAnswers = new String[Engine.getNumberOfRounds()][2];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            String[] progressionAndAnswer = generateProgression();
            progressionsAndAnswers[i][0] = progressionAndAnswer[0];
            progressionsAndAnswers[i][1] = progressionAndAnswer[1];
        }
        Engine.logic(task, progressionsAndAnswers);
    }

    public static String[] generateProgression() {
        final int progressionStepRange = 20;
        final int progressionLength = 10;
        final int firstNumberRange = 20;
        int progressionStep = Util.randomNumber(progressionStepRange);
        int[] progressionNumbers = new int[progressionLength];
        progressionNumbers[0] = Util.randomNumber(firstNumberRange);
        for (var i = 1; i < progressionLength; i++) {
            progressionNumbers[i] = progressionNumbers[i - 1] + progressionStep;
        }
        int missedNumber = Util.randomNumber(progressionLength - 1);
        int answer = progressionNumbers[missedNumber];
        var stringProgression = new StringBuilder();
        for (int number : progressionNumbers) {
            if (number == answer) {
                stringProgression.append(".. ");
                continue;
            }
            stringProgression.append(number);
            stringProgression.append(" ");
        }
        return new String[]{stringProgression.toString(), String.valueOf(answer)};
    }
}
