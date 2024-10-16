package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static void game(int numberOfRounds) {
        String task = "What number is missing in the progression?";
        String[][] progressionsAndAnswers = new String[2][numberOfRounds];
        for (var i = 0; i < numberOfRounds; i++) {
            int column = 0;
            String[] progressionAndAnswer = generateProgression();
            progressionsAndAnswers[column][i] = progressionAndAnswer[column];
            column++;
            progressionsAndAnswers[column][i] = progressionAndAnswer[column];
        }
        Engine.logic(task, progressionsAndAnswers[0], progressionsAndAnswers[1], numberOfRounds);
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
