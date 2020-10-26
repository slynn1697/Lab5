/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class TestScores {
    import java.util.Scanner;

public class TestScores extends Exception {

    Scanner keyboard = new Scanner(System.in);
    private double[] testScoresArray;

    public TestScores(double[] testScoresArray) {
        this.testScoresArray = testScoresArray;
    }

    public double[] getTestScoresArray() {
        return testScoresArray;
    }

    public void setTestScoresArray(double[] testScoresArray) {
        System.out.println("Please input 5 test scores");
//        this.testScoresArray = testScoresArray;
        for (int i = 0; i < testScoresArray.length; i++) {
            try {
                testScoresArray[i] = keyboard.nextDouble();
                if (testScoresArray[i] < 0 || testScoresArray[i] > 100) {
                    i = i - 1;
                    throw new InvalidTestScore("User has input a number below 0 or higher than 100");
                }
            } catch (InvalidTestScore x) {
                System.out.println("You have input a number lower than 0, or higher than 100.\n Please try again.");
            }
        }
    }
    
    public void testScoreAverages(double[] testScoresArray){
        double averages = 0;
        for(int i = 0; i < testScoresArray.length; i++){
            averages = testScoresArray[i] + averages;
        }
        averages = averages / 5;
        System.out.println("The average of the five scores would be: " + averages);
    }
}
}