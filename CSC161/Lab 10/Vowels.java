/* Allon Finezilber
   CSC-161 - C1
   Lab 10B */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class Vowels
{
    public static void main(String[] args)
    {
        int num = 0;

        num = isVowel(num);

        System.out.println("The number of vowels in the inserted line is: " + num);
    }

    public static int isVowel(int x)
    {
        String input;
        int counter = 0;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please insert a sentense to find out the number of vowels: ");
        input = keyboard.nextLine();
        System.out.println();

        for(int i = 0; i < input.length(); i++)
        {
         char c = input.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
            counter++;
            }
        }
        return counter;

  }
}