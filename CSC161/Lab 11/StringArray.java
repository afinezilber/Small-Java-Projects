/* Allon Finezilber
   CSC-161 - C1
   Lab 11D */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class StringArray
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {

     String str1, str2, str3;

     System.out.println("Please insert a string: ");
     str1 = keyboard.nextLine();
     getString(str1);
     System.out.println(" ");

     System.out.println("Please insert another string: ");
     str2 = keyboard.nextLine();
     getString(str2);
     System.out.println(" ");

     System.out.println("Please insert the last string: ");
     str3 = keyboard.nextLine();
     getString(str3);
     System.out.println(" ");


    }

    public static void getString(String str)
    {
        int strLength = str.length();
        int i;

        char[] charArray = new char[strLength];

        for(i = 0; i < strLength; i++)
        {
          charArray[i] = str.charAt(i);
          System.out.print(Character.toUpperCase(charArray[i]));
        }
        System.out.println(" ");
    }
}



