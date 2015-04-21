/*Allon Finezilber
  CSC-236
  Lab 4*/

public class Stacks<T>
{
	private int maxStackSize, stackTop;
	private T[] list;

	public Stacks()
	{
		maxStackSize = 100;
		stackTop = 0;
		list = (T[]) new Object[maxStackSize];
	}

	public Stacks(int stackSize)
	{

		if(stackSize <= 0)
		{
			System.err.println("The size of the array must be a positive number.");
			System.err.println("Creating array with default size of 100.");
			maxStackSize = 100;
		}
		else
			maxStackSize = stackSize;

		stackTop = 0;
		list = (T[]) new Object[maxStackSize];
	}

	public void initializeStack()
	{

		int i;
	    for(i = 0; i < stackTop; i++)
	    	list[i] = null;

	    stackTop = 0;
	}

	public boolean isEmptyStack()
	{
		return(stackTop == 0);
	}

	public boolean isFullStack()
	{
		return(stackTop == maxStackSize);
	}

	public void push(T newItem) throws StackOverflowException
	{
		if(isFullStack())
			throw new StackOverflowException();

		list[stackTop] = newItem;
		stackTop++;
	}

	public T peek() throws StackUnderflowException
	{
		if(isEmptyStack())
		  throw new StackUnderflowException();

		return (T)list[stackTop - 1];
	}

	public void pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();

		stackTop--;
		list[stackTop] = null;
	}


}
