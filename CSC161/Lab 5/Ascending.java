/* Allon Finezilber
   CSC-161 - C1
   Lab 5B */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask the user to input 3 numbers
// and then put them in ascending order

public class Ascending
{
    public static void main(String[] args)
    {
        String order;
        double x, y, z;
        order = "-The numbers in ascending order are: ";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please insert your first number: ");
        x = keyboard.nextDouble();

        System.out.print("Please insert your second number: ");
        y = keyboard.nextDouble();

        System.out.print("Please insert your third number: ");
        z = keyboard.nextDouble();

        if(x<=y)
            if(x<=z)
                if(y<=z)
                  System.out.println("\n" + order +  x + ", " + y + ", " + z + "\n");
                else
                  System.out.println("\n" + order + x + ", " + z + ", " + y + "\n");
            else
              System.out.println("\n" + order + z + ", " + x + ", " + y + "\n");
        else if(y<=z)
                 if(x<=z)
                  System.out.println("\n" + order + y + ", " + x + ", " + z + "\n");
                 else
                  System.out.println("\n" + order + y + ", " + z + ", " + x + "\n");
             else
               System.out.println("\n" + order + z + ", " + y + ", " + x + "\n");
    }
}
