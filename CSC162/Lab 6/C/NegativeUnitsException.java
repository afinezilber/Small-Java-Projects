/* Allon Finezilber
   CSC-162
   Lab 3F */


public class NegativeUnitsException extends Exception
{
	public NegativeUnitsException()
	{
		super("Error: Negative number given for units: ");
	}

	public NegativeUnitsException(String strMessage)
	{
		super(strMessage);
	}
}