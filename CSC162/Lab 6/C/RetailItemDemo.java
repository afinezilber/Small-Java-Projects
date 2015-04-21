/* Allon Finezilber
   CSC-162
   Lab 3F */

import java.util.Scanner;

public class RetailItemDemo
{
    public static void main(String[] args)
    {
		Scanner keyboard = new Scanner(System.in);

		RetailItem item1 = new RetailItem();

		String description = "";
		int unit = 0;
		double price = 0.0;

		System.out.println("Please insert an item: ");
		description = keyboard.nextLine();
		System.out.println();

		System.out.println("Please enter number of units: ");
		unit = keyboard.nextInt();

		while(unit < 0)
		{
		try
		{

			if(unit < 0)
				throw new NegativeUnitsException();
		}
		catch(NegativeUnitsException e)
		{
			System.out.println(e +""+ unit);
			System.out.println("Please enter a new unit: ");
			unit = keyboard.nextInt();
			System.out.println();

		}
	    }

		System.out.println();
		System.out.println("Please insert a price: ");
		price = keyboard.nextDouble();

		while(price < 0)
		{
		try
		{

			if(price < 0)
				throw new NegativePriceException();
		}
		catch(NegativePriceException e1)
		{
			System.out.println(e1 + "" + String.format("%,.2f", price));
			System.out.println("Please enter a new price: ");
			price = keyboard.nextDouble();
			System.out.println();
		}
		}

		item1.setDescription(description);
		item1.setUnitsOnHand(unit);
		item1.setPrice(price);
		System.out.println("\nOutput\n------");
		System.out.println(item1);
		System.out.println();


	}

}