package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    public static void gameProgression() {
        var task = "What number is missing in the progression?";
        var progressionAndAnswer1 = generateProgression();
        var progressionAndAnswer2 = generateProgression();
        var progressionAndAnswer3 = generateProgression();
        var progressions = new String[]{progressionAndAnswer1[1], progressionAndAnswer2[1], progressionAndAnswer3[1]};
        var answers = new String[]{progressionAndAnswer1[0], progressionAndAnswer2[0], progressionAndAnswer3[0]};
        Engine.logic(task, progressions, answers);
    }

    public static int generateNumber(int coefficient) {
        return (int) (Math.random() * coefficient);
    }

    public static String[] generateProgression() {
        final int progressionStepRange = 20;
        final int progressionLength = 10;
        final int firstNumberRange = 20;
        var progressionStep = generateNumber(progressionStepRange);
        int[] progressionNumbers = new int[progressionLength];
        progressionNumbers[0] = generateNumber(firstNumberRange);
        for (var i = 1; i < progressionLength; i++) {
            progressionNumbers[i] = progressionNumbers[i - 1] + progressionStep;
        }
        var missedNumber = generateNumber(progressionLength - 1);
        var answer = progressionNumbers[missedNumber];
        var stringProgression = Arrays.toString(progressionNumbers);
        String[] progression = stringProgression.substring(1, stringProgression.length() - 1).split(", ");
        progression[missedNumber] = "..";
        stringProgression = Arrays.toString(progression);
        stringProgression = stringProgression.replaceAll(",", "");
        stringProgression = stringProgression.substring(1, stringProgression.length() - 1);
        return new String[]{String.valueOf(answer), stringProgression};
    }
}
