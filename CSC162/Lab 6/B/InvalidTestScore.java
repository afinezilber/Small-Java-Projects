/* Allon Finezilber
   CSC-162
   Lab 1F */


public class InvalidTestScore extends Exception
{
	public InvalidTestScore()
	{
		super("Invalid Test Score!");
	}

	public InvalidTestScore(String strMessage)
	{
		super(strMessage);
	}
}