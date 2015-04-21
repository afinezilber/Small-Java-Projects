/* Allon Finezilber
   CSC-161 - C1
   Lab 3C */

import java.util.Scanner;  // Needed for the scanner
                           // class.

// This program will calculate the average
// of three test scores and display each score

public class TestAverage
{
    public static void main(String[] args)
    {
        // Score Variables
        int score1, score2, score3;
        double scoreAverage;

        // Impliment keyboard for user to input data
        Scanner keyboard = new Scanner(System.in);

        // Result of Test 1
        System.out.print("Please insert score of Test One: ");
        score1 = keyboard.nextInt();

        // Result of Test 2
        System.out.print("Please insert score of Test Two: ");
        score2 = keyboard.nextInt();

        // Result of Test 3
        System.out.print("Please insert score of Test Three: ");
        score3 = keyboard.nextInt();

        // The calculation for the average of the tests
        scoreAverage = ((score1 + score2 + score3) / 3);


        // Displaying the scores and the score average
        System.out.println(" ");
        System.out.println("The score of your first test is: "
                            + score1);
        System.out.println("The score of your second test is: "
                            + score2);
        System.out.println("The score of your third test is: "
                            + score3);
        System.out.println("Your average test score is: "
                            + scoreAverage);
        System.out.println(" ");
     }
}

