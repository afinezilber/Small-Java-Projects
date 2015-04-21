/* Allon Finezilber
   CSC-162
   Lab 3F */


public class NegativePriceException extends Exception
{
	public NegativePriceException()
	{
		super("Error: Negative number given for the price: ");
	}

	public NegativePriceException(String strMessage)
	{
		super(strMessage);
	}
}