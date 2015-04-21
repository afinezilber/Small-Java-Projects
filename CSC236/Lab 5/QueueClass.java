/*Allon Finezilber
  CSC-236
  Lab 5*/

public class QueueClass<T>
{
	private int maxQueueSize;
	private int count;
	private int queueFront;
	private int queueRear;
	private T[] list;

	public QueueClass()
	{
		maxQueueSize = 100;
		queueFront = 0;
		queueRear = maxQueueSize - 1;
		count = 0;
		list = (T[]) new Object[maxQueueSize];
	}

	public QueueClass(int queueSize)
	{
		if(queueSize <= 0)
		{
			System.err.println("Array size must be a positive number. Creating array at default size of 100.");
			maxQueueSize = 100;
		}
		else
			maxQueueSize = queueSize;

		queueFront = 0;
		queueRear = maxQueueSize - 1;
		count = 0;
		list = (T[]) new Object[maxQueueSize];
	}

	public void initializeQueue()
	{
		for(int i = queueFront; i < queueRear; i = (i + 1) % maxQueueSize)
		list[i] = null;

		queueFront = 0;
		queueRear = maxQueueSize - 1;
		count = 0;
	}

	public boolean isEmptyQueue()
	{
		return(count == 0);
	}

	public boolean isFullQueue()
	{
		return(count == maxQueueSize);
	}

	public T peek() //throws QueueUnderflowException
	{
		/*if(isEmptyQueue())
			throw new QueueUnderflowException();*/

		return (T) list[queueFront];
	}

	/*public T back() throws QueueOverflowException
	{
		if(isFullQueue())
			throw new QueueUnderflowException();

		return (T) list[queueRear];
	}
*/
	public void enqueue(T queueElement) throws QueueOverflowException
	{
		if(isFullQueue())
			throw new QueueOverflowException();

		queueRear = (queueRear + 1) % maxQueueSize;
		count++;
		list[queueRear] = queueElement;
	}

	public void dequeue() throws QueueUnderflowException
	{
		if(isEmptyQueue())
			throw new QueueUnderflowException();

		count--;
		list[queueFront] = null;

		queueFront = (queueFront + 1) % maxQueueSize;
	}
}