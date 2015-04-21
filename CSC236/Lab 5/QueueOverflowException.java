/*Allon Finezilber
  CSC-236
  Lab 5*/


public class QueueOverflowException extends RuntimeException
{
	public QueueOverflowException()
	{
		super("Error: Queue is full");
    }

	public QueueOverflowException(String strMessage)
	{
		super(strMessage);
	}
}
