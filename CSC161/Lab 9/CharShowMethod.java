/* Allon Finezilber
   CSC-161 - C1
   Lab 9A */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will

public class CharShowMethod
{
    public static void main(String[] args)
    {
        String str = "New York";
        int num = 2;

        showChar(str, num);

    }

    public static void showChar(String str1, int num1)
    {
        char a;
        a = str1.charAt(num1);
        System.out.println("The charAt placement " + num1 + " of " + str1 + " is " + a);
    }
}
