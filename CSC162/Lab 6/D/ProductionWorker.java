/* Allon Finezilber
   CSC-162
   Lab 3A1*/

public class ProductionWorker extends Employee
{

	private int shift;
	private double hourlyPayRate;

	public ProductionWorker()
	{
		super();
		shift = 1;
		hourlyPayRate = 0;
	}

	public ProductionWorker(String name, String hireDate, int employeeNum, int shift, double hourlyPayRate) throws InvalidEmployeeNumber, InvalidPayRate, InvalidShift
	{
		super(name, hireDate, employeeNum);
		setShift(shift);
		setHourlyPayRate(hourlyPayRate);
	}

	public void setShift(int shift) throws InvalidShift
	{



		try
		{

			if(shift != 1 && shift != 2)
				throw new InvalidShift("Invalid Shift: " + shift);
			else
				this.shift = shift;
		}
		catch(InvalidShift e2)
		{
			throw e2;
		}
	}

	public void setHourlyPayRate(double hourlyPayRate) throws InvalidPayRate
	{

			try
			{
				this.hourlyPayRate = hourlyPayRate;
				if(hourlyPayRate < 0)
					throw new InvalidPayRate("Invalid Pay Rate: " + hourlyPayRate);
			}
			catch(InvalidPayRate e3)
			{
				throw e3;
			}

	}

	public int getShift()
	{
		return shift;
	}

	public double getHourlyPayRate()
	{
		return hourlyPayRate;
    }

    public String toString()
    {
		if(shift == 1)
		return(super.toString() + "\n" + "Day Shift\n" + "Pay Rate per Hour: " + String.format("$%.2f%n", hourlyPayRate));

		else
		return(super.toString() + "\n" + "Night Shift\n" + "Pay Rate per Hour: " + String.format("$%.2f%n", hourlyPayRate));
	}
}





