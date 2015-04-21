/* Allon Finezilber
   CSC-162
   Lab 4F */


public class InvalidEmployeeNumber extends Exception
{
	public InvalidEmployeeNumber()
	{
		super("Error: Invalid Employee Number! ");
	}

	public InvalidEmployeeNumber(String strMessage)
	{
		super(strMessage);
	}
}