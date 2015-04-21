/*Allon Finezilber
  CSC-236
  Lab 4*/


public class StackUnderflowException extends RuntimeException
{
	public StackUnderflowException()
	{
		super("Error: Stack is empty");
    }

	public StackUnderflowException(String strMessage)
	{
		super(strMessage);
	}
}
