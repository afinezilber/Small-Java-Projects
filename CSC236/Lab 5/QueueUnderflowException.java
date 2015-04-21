/*Allon Finezilber
  CSC-236
  Lab 5*/


public class QueueUnderflowException extends RuntimeException
{
	public QueueUnderflowException()
	{
		super("Error: Queue is empty");
    }

	public QueueUnderflowException(String strMessage)
	{
		super(strMessage);
	}
}
