/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
import java.util.Random;

public class questionFiveMain {

    public static void main(String[] args) {
        Random rand = new Random();
        int numberToCheck = rand.nextInt(40);
        System.out.println("Your number is: " + numberToCheck);
        int[] arrayOfNumbers = new int[]{5, 7, 9, 11, 15, 32, 40};
        arrayMethod(arrayOfNumbers, numberToCheck);
    }

    public static void arrayMethod(int[] arrayOfNumbers, int numberToTest) {
        for (int i = 0; i <= 6; i++) {
            if (numberToTest > arrayOfNumbers[i]) {
                System.out.println("Your number: " + numberToTest + " is greater than " + arrayOfNumbers[i]);
            } else System.out.println("Your number: " + numberToTest + " is less than " + arrayOfNumbers[i]);
        }
        System.out.println();
    }
}
