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
        var progressionStep = generateNumber(20);
        int[] progressionNumbers = new int[10];
        progressionNumbers[0] = generateNumber(20);
        for (var i = 0; i < 9; i++) {
            progressionNumbers[i + 1] = progressionNumbers[i] + progressionStep;
        }
        var missedNumber = generateNumber(9);
        var answer = progressionNumbers[missedNumber];
        var stringProgression = Arrays.toString(progressionNumbers);
        String[] progression = stringProgression.substring(1, stringProgression.length()-1).split(", ");
        progression[missedNumber] = "..";
        stringProgression = Arrays.toString(progression);
        stringProgression = stringProgression.replaceAll(",", "");
        stringProgression = stringProgression.substring(1, stringProgression.length() - 1);
        return new String[]{String.valueOf(answer), stringProgression};
    }
}
