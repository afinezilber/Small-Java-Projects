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

	public ProductionWorker(String name, String hireDate, int employeeNum, char employeeChar, int shift, double hourlyPayRate)
	{
		super(name, hireDate, employeeNum, employeeChar);
		setShift(shift);
		setHourlyPayRate(hourlyPayRate);
	}

	public void setShift(int shift)
	{
		this.shift = shift;
	}

	public void setHourlyPayRate(double hourlyPayRate)
	{
		this.hourlyPayRate = hourlyPayRate;
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
		return(super.toString() + "\n" + "Day Shift\n" + "Pay Rate per Hour: " + String.format("$%.2f%n%n", hourlyPayRate));

		else
		return(super.toString() + "\n" + "Night Shift\n" + "Pay Rate per Hour: " + String.format("$%.2f%n%n", hourlyPayRate));
	}
}





