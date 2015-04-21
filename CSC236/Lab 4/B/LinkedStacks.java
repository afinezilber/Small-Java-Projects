/*Allon Finezilber
  CSC-236
  Lab 4*/

public class LinkedStacks<T>
{

	private class StackNode<T>
	{
		public T info;
		public StackNode<T> link;

		public StackNode()
		{
			info = null;
			link = null;
		}

		public StackNode(T elem, StackNode<T> ptr)
		{
			info = elem;
			link = ptr;
		}

		public String toString()
		{
			return info.toString();
		}
	}

	private StackNode<T> stackTop;

	public LinkedStacks()
	{
		stackTop = null;
	}

	public void initializeStack()
	{
		stackTop = null;
	}

	public boolean isEmptyStack()
	{
		return(stackTop == null);
	}

	public boolean isStackFull()
	{
		return false;
	}

	public void push(T newElement)
	{
		StackNode<T> newNode;
		newNode = new StackNode<T>(newElement, stackTop);
		stackTop = newNode;
	}

	public T peek() throws StackUnderflowException
	{
		if(stackTop == null)
		  throw new StackUnderflowException();

		return stackTop.info;
	}

	public void pop() throws StackUnderflowException
	{
		if(stackTop == null)
		  throw new StackUnderflowException();

		stackTop = stackTop.link;
	}
}
