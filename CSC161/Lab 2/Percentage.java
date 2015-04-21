/* Allon Finezilber
   CSC-161 - C1
   Lab 2F */

   // This program will calculate two numbers and display their sum.

public class Percentage
{
    public static void main(String[] args)
    {

        int num1;
        double num2, total;
        num1 = 4600000;              // Values of the variables
        num2 = 0.62;
        total = num1 * num2;

        // Calculation of the company's profit
        System.out.println("The East Coast Division company made: $" + num1 + " this year with a 62%\nincrease in sales.");
        System.out.println("It is predicted based on last years sales that the company will make an\nadditional $" + total + " revenue");
        System.out.println("resulting in a total of $" + (total + num1) + " of sales for next year.");
    }
}