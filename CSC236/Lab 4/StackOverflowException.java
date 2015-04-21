/*Allon Finezilber
  CSC-236
  Lab 4*/


public class StackOverflowException extends RuntimeException
{
	public StackOverflowException()
	{
		super("Error: Stack is full");
    }

	public StackOverflowException(String strMessage)
	{
		super(strMessage);
	}
}
