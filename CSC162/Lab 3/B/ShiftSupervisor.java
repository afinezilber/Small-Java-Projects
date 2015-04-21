/* Allon Finezilber
   CSC-162
   Lab 3B */

public class ShiftSupervisor extends Employee
{
	private double annualSalary, annualProduction;

	public ShiftSupervisor()
	{
		annualSalary = 0;
		annualProduction = 0;
	}

	public ShiftSupervisor(String name, String hireDate, int employeeNum, char employeeChar,
						   double annualSalary, double annualProduction)
	{
		super(name, hireDate, employeeNum, employeeChar);
		setAnnualSalary(annualSalary);
		setAnnualProduction(annualProduction);
	}

	public void setAnnualSalary(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}

	public void setAnnualProduction(double annualProduction)
	{
		this.annualProduction = annualProduction;
	}

	public double getAnnualSalary()
	{
		return annualSalary;
	}

	public double getAnnualProduction()
	{
		return annualProduction;
	}

	public String toString()
	{
		return(super.toString() + "\nAnnual Salary: " + String.format("$%,.2f", annualSalary) +
								"\nProduction Bonus: " + String.format("$%,.2f", annualProduction) + "\n" );
    }
}


