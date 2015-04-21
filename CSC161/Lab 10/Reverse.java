/* Allon Finezilber
   CSC-161 - C1
   Lab 10C */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a number and will
// display the number back in reverse.

public class Reverse
{
    public static void main(String[] args)
    {
        int num = 0;

        num = reverseDigit(num);

        System.out.println("The number reversed is: " + num);

    }

    public static int reverseDigit(int x)
    {
        String num, num2 = "";
        int numLength;


        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user to input the number
        System.out.print("Please insert your desired number to be reversed: ");
        num = keyboard.nextLine();

        // Evaluates how many digits are in inserted number
        numLength = num.length();

        char a;

        while( 0 < (numLength))
        {
            a = num.charAt(numLength-1);
            Character.toString(a);
            num2 = num2 + a;
            numLength--;
        }

        int num3 = Integer.parseInt(num2);
        return num3;
    }
}

//        c1 = num.charAt(numLength-1);
//        num3 = Character.toString(c1);
