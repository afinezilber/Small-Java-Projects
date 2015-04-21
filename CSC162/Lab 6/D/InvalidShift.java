/* Allon Finezilber
   CSC-162
   Lab 4F */


public class InvalidShift extends Exception
{
	public InvalidShift()
	{
		super("Error: Invalid Shift! ");
	}

	public InvalidShift(String strMessage)
	{
		super(strMessage);
	}
}