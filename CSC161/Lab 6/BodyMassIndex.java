/* Allon Finezilber
   CSC-161 - C1
   Lab 6C */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask the user to input a day month and year
// and determine if its considered a magic month

public class BodyMassIndex
{
    public static void main(String[] args)
    {
        String BMIS1, BMIS2, BMIS3;
        double weight, height, BMI;
        BMIS1 = "-According to your BMI, you are in optimum weight.";
        BMIS2 = "-According to your BMI, you are underweight.";
        BMIS3 = "-According to your BMI, you are overweight.";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user for their weight
        System.out.print("Please insert your weight in lbs.: ");
        weight = keyboard.nextDouble();

        // Asks the user for their height
        System.out.print("Please enter your height in inches: ");
        height = keyboard.nextDouble();

        // The calculation to calculate the BMI
        BMI = (weight * 703.0) / (Math.pow(height, 2.0));

        // The if-else statement to determine the users BMI status
        if(18.5<= BMI && BMI <=25.0)
            System.out.println("\n" + BMIS1 + "\n");
        else if(BMI<18.5)
                 System.out.println("\n" + BMIS2 + "\n");
             else if(BMI>25.0)
                      System.out.println("\n" + BMIS3 + "\n");

      }
}


