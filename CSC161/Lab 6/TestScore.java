/* Allon Finezilber
   CSC-161 - C1
   Lab 6D */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask for three test grades, take average and
// display the score and its letter value

public class TestScore
{
    public static void main(String[] args)
    {

        String scoreS1, scoreS2;
        int score1, score2, score3;
        double avg;
        scoreS1 = "-Your test score average is: ";
        scoreS2 = " your letter grade is: ";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Asks user for first test score
        System.out.print("Please enter the score of your first test: ");
        score1 = keyboard.nextInt();
        // Asks user for second test score
        System.out.print("Please enter the score of your second test: ");
        score2 = keyboard.nextInt();
        // Asks user for the third test score
        System.out.print("Please enter the score of your third test: ");
        score3 = keyboard.nextInt();
        // Calculation for the average of the scores
        avg = (score1 + score2 + score3) / 3.0;
        // If else statement to determine the grade and its letter value
        if(avg >= 90)
            System.out.printf("%n %s %.2f %s A%n%n", scoreS1, avg, scoreS2);
        else if(80 <= avg && avg <= 89)
            System.out.printf("%n %s %.2f %s B%n%n", scoreS1, avg, scoreS2);
        else if(70 <= avg && avg <= 79)
            System.out.printf("%n %s %.2f %s C%n%n", scoreS1, avg, scoreS2);
        else if(60 <= avg && avg <= 69)
            System.out.printf("%n %s %.2f %s D%n%n", scoreS1, avg, scoreS2);
        else if(60 > avg)
            System.out.printf("%n %s %.2f %s F%n%n", scoreS1, avg, scoreS2);
    }
}