/* Allon Finezilber
   CSC-161 - C1
   Lab 8C */
import java.text.DecimalFormat;  // Needed for the Decimal Format
import java.util.Scanner;        // Needed for the Scanner Class

// This program will ask the user to input the number of days he has worked
// and the program will determine the amount of money he has made to day

public class Pennies
{
    public static void main(String[] args)
    {
        int days;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user to insert days worked
        System.out.println("*Inserted number must be a positive and nonzero number*");
        System.out.print("Please insert the number of days worked: ");
        days = keyboard.nextInt();

        // Varifies the number inserted isnt a 0 or negative
        while(days <= 0)
        {
            System.out.println("\nThe number inserted is invalid!.");
            System.out.print("Please insert a new value for days worked: ");
            days = keyboard.nextInt();
        }

        String daysS, salaryS, dashS;
        int i;
        double j = days;
        double total = 0;
        double salary = 1;
        daysS = "Day Worked";
        salaryS = "Pennies Earned";
        dashS = "----------";
        int num = 1;

           System.out.printf("%n%-15s %-15s%n", daysS, salaryS);
           System.out.printf("%-15s %-15s%n", dashS, dashS);
           System.out.printf("%-15d %-15.0f%n", num, (salary));
           total = total + salary;

         // Calculation for days worked and pennies earned
        for(i = 2; i <= j; i++)
         {
           salary = salary * 2;
           System.out.printf("%-15d %,-15.0f%n", i, (salary));
           total = total + salary;
         }

         // Create a DecimalFormat object.
         DecimalFormat formatter = new DecimalFormat("#,##0.00");

         System.out.println("\nThe total amount paid until today is: $" + formatter.format(total / 100));
         System.out.println(" ");


     }
}

