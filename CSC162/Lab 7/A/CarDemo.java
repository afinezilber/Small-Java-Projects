/* Allon Finezilber
   CSC-162
   Lab 7A */


public class CarDemo
{
	public static void main(String args[])
	{

		Odometer mile = new Odometer();

		System.out.println("Fueling Car...\n");

		while(mile.getFuel() < 15)
		{
			System.out.print("Adding 1 Gallon, Fuel is currently at: ");
			mile.incFuel();
		}

		System.out.println("\nMiles Driven \t\t Gas Left");
		System.out.println("-------------\t\t---------");
		while(mile.getFuel() > 0)
		{
			for(int i = 0; i < 24; i++)
			{
				mile.incMilage();
			}
			System.out.println(String.format("%.2f", mile.getTrip()) + "\t\t\t" + String.format("%.2f Gallons", mile.getFuel()));
		}

		System.out.println();
	}
}