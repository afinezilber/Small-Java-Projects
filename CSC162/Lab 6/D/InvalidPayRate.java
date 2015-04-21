/* Allon Finezilber
   CSC-162
   Lab 4F */


public class InvalidPayRate extends Exception
{
	public InvalidPayRate()
	{
		super("Error: Invalid Pay Rate! ");
	}

	public InvalidPayRate(String strMessage)
	{
		super(strMessage);
	}
}