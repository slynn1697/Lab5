/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Question11 {
     public static void main(String[] args) {
        float[] arrayOfTestScores = new float[]{75.21F, 89.21F, 97.5F, 32.12F, 68.5F, 92.75F, 83.5F};
        float sumOfScores = getTotal(arrayOfTestScores);
        float averageOfScores = getAverage(arrayOfTestScores);
        float highestOfScores = getHighest(arrayOfTestScores);
        float lowestOfScores = getLowest(arrayOfTestScores);

        System.out.println("The sum of all test scores is: " + sumOfScores);
        System.out.println("The average of all test scores is: " + averageOfScores);
        System.out.println("The highest test score is: " + highestOfScores);
        System.out.println("The lowest test score is: " + lowestOfScores);
    }

    public static float getTotal(float[] arrayOfTestScores) {
        float scoreTotals = 0;
        for (int i = 0; i < arrayOfTestScores.length; i++) {
            scoreTotals = scoreTotals + arrayOfTestScores[i];
        }
        return scoreTotals;
    }

    public static float getAverage(float[] arrayOfTestScores) {
        float testScoreAverage = 0;
        float testScoreTotal = 0;
        for (int i = 0; i < arrayOfTestScores.length; i++) {
            testScoreTotal += arrayOfTestScores[i];
        }
        testScoreAverage = testScoreTotal / arrayOfTestScores.length;
        return testScoreAverage;
    }

    public static float getHighest(float[] arrayOfTestScores) {
        float highestScore = 0;
        for (int i = 0; i < arrayOfTestScores.length; i++) {
            if (arrayOfTestScores[i] > highestScore) {
                highestScore = arrayOfTestScores[i];
            }
        }
        return highestScore;
    }

    public static float getLowest(float[] arrayOfTestScores) {
        float lowestScore = 100;
        for (int i = 0; i < arrayOfTestScores.length; i++) {
            if (arrayOfTestScores[i] < lowestScore) {
                lowestScore = arrayOfTestScores[i];
            }
        }
        return lowestScore;
    }
}