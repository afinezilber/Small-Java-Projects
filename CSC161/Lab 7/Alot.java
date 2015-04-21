/* Allon Finezilber
   CSC-161 - C1
   Lab 7E */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will break apart a number based on its digits
// and add them together to display its sum

public class Alot
{
    public static void main(String[] args)
    {

        int firstNum, secondNum;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Part A
        System.out.println("*Insert two numbers. the first number must be higher than the second* ");
        System.out.print("Please insert the first number: ");
        firstNum = keyboard.nextInt();

        System.out.print("Please insert the second number: ");
        secondNum = keyboard.nextInt();

        while(firstNum > secondNum)
        {
            System.out.println("\nThe second number inputted is smaller than the first.");
            System.out.print("Please insert a new value for the second number: ");
            secondNum = keyboard.nextInt();
        }

        System.out.println(" ");
        int numOdd = firstNum;

        // Part B
        System.out.print("The odd numbers between " + firstNum + " and "
                        + secondNum + " are: ");
        if(firstNum%2 != 0)
             while(numOdd + 2 < secondNum)
            {
                 numOdd = numOdd + 2;
                 System.out.print(numOdd + " ");

             }
        else
            {
             numOdd = ++numOdd;
             while(numOdd < secondNum)
             {
                 System.out.print(numOdd + " ");
                 numOdd = numOdd + 2;
             }
            }
        System.out.println("\n");

        // Part C
        int sumEven = 0;
        int numEven = firstNum;

        if(firstNum%2 == 0)
        {
            while(numEven + 2 < secondNum)
             {
                 numEven = numEven + 2;
                 sumEven = sumEven + numEven;
                 System.out.print(sumEven + " ");
             }
         }
        else
        {
             numEven = ++numEven;
             while(numEven < secondNum)
            {
                 sumEven = sumEven + numEven;
                 numEven = numEven + 2;
             }
        }
        System.out.println("The sum of the even numbers between " + firstNum
                            + " and " + secondNum + " is: " + sumEven);
        System.out.println(" ");

        // Part D
        double squareNum = 1;

        while(squareNum <= 10)
        {
            System.out.printf("The squareroot of %.0f is ", squareNum);
            System.out.printf("%.2f%n", Math.sqrt(squareNum));
            squareNum = ++squareNum;
        }

        System.out.println(" ");

        // Part E

        double oddSquare, oddSquareSum = 0.0;
        double numOddD = firstNum;

        System.out.print("The squareroot sum of the odd numbers between " + firstNum + " and "
                        + secondNum + " is: ");
        if(firstNum%2 != 0)
             while(numOddD + 2 < secondNum)
            {
                 numOddD = numOddD + 2.0;
                 oddSquare = Math.sqrt(numOddD);
                 oddSquareSum = oddSquareSum + oddSquare;

             }

        else
           {
               numOddD = ++numOddD;
               while(numOddD < secondNum)
             {

                 oddSquare = Math.sqrt(numOddD);
                 oddSquareSum = oddSquareSum + oddSquare;
                 numOddD = numOddD + 2.0;
             }
           }

           System.out.printf("%.2f", oddSquareSum);
        System.out.println("\n");

  }
}


