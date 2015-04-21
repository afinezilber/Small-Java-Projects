/* Allon Finezilber
   CSC-161 - C1
   Lab 7D */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will determine if the inserted number is a prime number

public class Prime
{
  public static void main(String[] args)
  {

    int input;
    double root;
    boolean prime = true;

    // Scanner Object for the keyboard input
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please insert your desired number: ");
    input = keyboard.nextInt();

    if(input%2 != 0)
    {
        root = Math.sqrt(input);
        for(int i=3; i <= root; i = i + 2)
        {
            if(input%i == 0)
            {
                prime = false;
            }

        }
    }
    else
    {
        if(input != 2)
        prime = false;
    }

    if(prime)
        System.out.println(input + " is a prime number!");
    else
        System.out.println(input + " is not a prime number!");
    }
}
