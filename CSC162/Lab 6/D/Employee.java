/* Allon Finezilber
   CSC-162
   Lab 3A */

public class Employee
{

	private String name, hireDate;
	private int employeeNum;
	private boolean validation;

	public Employee()
	{
		name = "";
		hireDate = "";
		employeeNum = 0;
		validation = true;
	}

	public Employee(String name, String hireDate, int employeeNum) throws InvalidEmployeeNumber
	{
		setName(name);
		setHireDate(hireDate);
		setEmployeeNum(employeeNum);
		validation = true;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setHireDate(String hireDate)
	{
		this.hireDate = hireDate;
	}

	public void setEmployeeNum(int employeeNum) throws InvalidEmployeeNumber
	{
		try
		{
			this.employeeNum = employeeNum;
			if(employeeNum < 0 || employeeNum > 9999)
				throw new InvalidEmployeeNumber("Invalid Employee Number: " + employeeNum);

		}
		catch(InvalidEmployeeNumber e1)
		{
			throw e1;
		}


	}


	public String getName()
	{
		return name;
	}

	public String getHireDate()
	{
		return hireDate;
	}

	public int getEmployeeNum()
	{
		return employeeNum;
	}


	public boolean isValidEmpNum(int employeeNum, char employeeChar)
	{
		if(employeeNum < 0 || employeeNum > 1000)
			validation = false;

		    return validation;
    }


	public String toString()
	{
		return("Name: " + name + "\n" + "ID: " + employeeNum +  "\n" + "Hire Date: " + hireDate);
	}
}
