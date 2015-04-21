/* Allon Finezilber
   CSC-161 - C1
   Lab 7B */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will break apart a number based on its digits
// and add them together to display its sum

public class Reverse
{
    public static void main(String[] args)
    {
        String num;
        int numLength;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user to input the number
        System.out.print("Please insert your desired number to be reversed: ");
        num = keyboard.nextLine();

        // Evaluates how many digits are in inserted number
        numLength = num.length();

        char a;

        System.out.print("\n-The number you input reserved is: ");

        while( 0 < (numLength))
        {
            a = num.charAt(numLength-1);
            System.out.print(a);
            numLength--;
        }

        System.out.println("\n");
    }
}