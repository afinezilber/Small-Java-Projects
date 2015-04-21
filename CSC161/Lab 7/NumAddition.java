/* Allon Finezilber
   CSC-161 - C1
   Lab 7A */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will break apart a number based on its digits
// and add them together to display its sum

public class NumAddition
{
    public static void main(String[] args)
    {
        String num;
        int numLength;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please insert your desired number: ");
        num = keyboard.nextLine();

        // Evaluates how many digits are in inserted number
        numLength = num.length();

        int sum =0;
        int i = 0;

        char a = num.charAt(0);
        if(a == '-')
        {
            i = 1;
        }
        while( i < numLength)
        {
            a = num.charAt(i);
            System.out.print(a + " ");
            sum = sum + Character.getNumericValue(a);
            i++;
        }

        System.out.println(sum);
    }
}





