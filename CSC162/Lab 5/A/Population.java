/* Allon Finezilber
   CSC-162
   Lab 2E */


import java.util.Scanner;

public class Population
{

   static int n = 0;

   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);

	   int orgs;
	   int dailyInc;
	   int days;

	   System.out.print("Please enter the name of organisms: ");
	   orgs = keyboard.nextInt();

	   while(orgs <= 0)
	   {
		   System.out.println("That is an invalid number for organisms."
		   					  + " Please insert a valid amount: ");
		   orgs = keyboard.nextInt();
	   }

	   System.out.print("Please enter the daily increase of the organisms: ");
	   dailyInc = keyboard.nextInt();

	   while(dailyInc <= 0)
	   {
		   System.out.println("That is an invalid number for daily increase."
		   				      + " Please insert a valid amount: ");
		   dailyInc = keyboard.nextInt();
	   }

	   System.out.print("Please enter the number of days the organisms will multiply: ");
	   days = keyboard.nextInt();

	   while(days <= 0)
	   {
		   System.out.println("That is an invalid number for daily increase."
		   					  + " Please insert a valid amount: ");
		   days = keyboard.nextInt();
	   }

	   displayPopulation(orgs, dailyInc, days, n);
   }

   public static void displayPopulation(int orgs, int dailyInc, int days, int n)
   {
	   double pop;
	   double calc = 0.0;
	   System.out.println("\n\nDay \t\t Organism");
	   System.out.println("__________________________\n");
	   pop = showPopulation(orgs, dailyInc, days, n, calc);
	   System.out.println();
   }

   public static double showPopulation(int orgs, int dailyInc, int days, int n, double calc)
   {

	   double calc1 = orgs;

	   if(n == days)
	   {
		   return calc1;
	   }

	   else
	   {
		   calc1 = showPopulation(orgs, dailyInc, days, n + 1, calc) + dailyInc;
		   System.out.println((days - n) + "\t\t  " + calc1);
		   return calc1;
	   }
   }



}