/*Allon Finezilber
  CSC-236
  Lab 4*/

import java.util.*;

public class Factor
{
	public static void main(String args[]) throws StackUnderflowException
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please insert a number to check it's Prime Factorization:");
		int num = keyboard.nextInt();
		int input = num;
		System.out.println();

        LinkedStacks<Integer> stack  = new LinkedStacks<Integer>();

		for(int i = 2; i <= num; i++)
		{
			while(num % i == 0)
			{
				stack.push(i);
				num = num / i;
			}
		}

		System.out.println("The Prime Factorization of " + input + " is: ");
		int k = stack.peek();
		stack.pop();
		System.out.print(k);

		while(!stack.isEmptyStack())
		{
			if(!stack.isEmptyStack())
			{
				int j = stack.peek();
			    stack.pop();
			    System.out.print(" * " + j);
			}

		}

		System.out.println();
		System.out.println();
	}
}