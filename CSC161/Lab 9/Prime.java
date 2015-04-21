/* Allon Finezilber
   CSC-161 - C1
   Lab 9D */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will

public class Prime
{
    public static void main(String[] args)
    {
        int input;
        boolean prime = true;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please insert a number to determine if its prime: ");
        input = keyboard.nextInt();

        prime = isPrime(input);

        if(prime)
            System.out.println(input + " is a prime number!");
        else
            System.out.println(input + " is not a prime number!");
    }

    public static boolean isPrime(int input1)
    {
        boolean prime1 = true;
        double root;

        if(input1%2 != 0)
        {
          root = Math.sqrt(input1);
          for(int i=3; i <= root; i = i + 2)
          {
            if(input1%i == 0)
              {
               prime1 = false;
               return prime1;
              }

          }
        }
        else
        {
          if(input1 != 2)
          {
          prime1 = false;
          return prime1;
          }
        }
      return prime1;
   }

}