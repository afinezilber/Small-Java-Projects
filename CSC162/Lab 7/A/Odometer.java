/* Allon Finezilber
   CSC-162
   Lab 7A */


public class Odometer extends FuelGauge
{
	private double milage;
	private double trip;

	public Odometer()
	{
		super();
		milage = 0.0;
		trip = 0.0;
	}

	public Odometer(double milage, double fuel)
	{
		super(fuel);
		setMilage(milage);
		trip = 0.0;
	}

	public void setMilage(double milage)
	{
		this.milage = milage;
	}

	public double getMilage()
	{
		return milage;
	}

	public double getTrip()
	{
		return trip;
	}

	public void incMilage()
	{
		trip++;
		milage++;

		if(milage > 999999)
		   milage = 0;

		if(trip % 24 == 0)
		    decFuel();
	}
}