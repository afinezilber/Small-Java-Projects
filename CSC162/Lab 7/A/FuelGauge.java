/* Allon Finezilber
   CSC-162
   Lab 7A */


public class FuelGauge
{
	private double fuel;

	public FuelGauge()
	{
		fuel = 0.0;
	}

	public FuelGauge(double fuel)
	{
		setFuel(fuel);
	}

	public void setFuel(double fuel)
	{
		this.fuel = fuel;
	}

	public double getFuel()
	{
		return fuel;
	}

	public void incFuel()
	{
		if(fuel < 15)
		{
			fuel++;
			System.out.println(String.format("%.2f", fuel));
		}
		else
			System.out.println("Invalid Fuel. Negative Gallons.");
	}

	public void decFuel()
	{
		if(fuel > 0)
			fuel--;
	}
}

