/* Allon Finezilber
   CSC-162
   Lab 3C */

public class Employee
{

	private String name, hireDate;
	private int employeeNum;
	private char employeeChar;
	private boolean validation;

	public Employee()
	{
		name = "";
		hireDate = "";
		employeeNum = 0;
		employeeChar = '*';
		validation = true;
	}

	public Employee(String name, String hireDate, int employeeNum, char employeeChar)
	{
		setName(name);
		setHireDate(hireDate);
		setEmployeeNum(employeeNum);
		setEmployeeChar(employeeChar);
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

	public void setEmployeeNum(int employeeNum)
	{
		this.employeeNum = employeeNum;
	}

	public void setEmployeeChar(char employeeChar)
	{
		this.employeeChar = employeeChar;
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

	public char getEmployeeChar()
	{
		return employeeChar;
	}

	public boolean isValidEmpNum(int employeeNum, char employeeChar)
	{
		if(employeeNum < 0 || employeeNum > 1000)
			validation = false;

		if(employeeChar < 'A' || employeeChar > 'M')
		    validation = false;

		    return validation;
    }


	public String toString()
	{
		return("Name: " + name + "\n" + "ID: " + employeeNum + "-" + employeeChar + "\n" + "Hire Date: " + hireDate);
	}
}
