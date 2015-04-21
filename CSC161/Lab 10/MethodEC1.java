/* Allon Finezilber
   CSC-161 - C1
   Lab 10E */

import java.util.Scanner;  // Needed for the Scanner Class

public class MethodEC1
{
    public static void main(String[] args)
    {
        int num, receiveInt;
        double dec;
        double receieveDbl;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        receiveInt = one(3, 5);
        System.out.println("Value of one with parameters 3 and 5 = " + receiveInt);

        System.out.print("\nPlease insert an integer number: ");
        num = keyboard.nextInt();
        System.out.print("Please insert a double number: ");
        dec = keyboard.nextDouble();

        receieveDbl = two(num, dec);

        System.out.println("\nThe value of two with parameters " + num + " and " + dec + " = " + receieveDbl + "\n");


    }

    public static int one(int x, int y)
    {
        int r;

        if(x > y)
         r = x + y;
        else
         r = (x - 2) * y;

        return r;
    }

    public static double two(int x, double a)
    {
        int first;
        double z;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nPlease insert a number: ");
        z = keyboard.nextDouble();

        z = z + a;

        first = one(6, 8);

        first = first + x;

        if(z > (first * 2))
         z = z;
        else
         z = (first * 2 ) - z;

         return z;

    }
}
