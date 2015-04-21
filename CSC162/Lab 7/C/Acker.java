/* Allon Finezilber
   CSC-162
   Lab 7C */

import java.util.Scanner;

public class Acker
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int m, n, result;

		System.out.print("Please insert a value for m: ");
		m = keyboard.nextInt();
		System.out.print("Please insert a value for n: ");
		n = keyboard.nextInt();
		System.out.println();

		result = ackermann(m, n);
		System.out.println("The Ackermann solution for: " + m + " and " + n + " is: " + result);
		System.out.println();
	}

	public static int ackermann(int m, int n)
	{
		if(m == 0)
			return(n + 1);
		if(n == 0)
			return(ackermann(m - 1, 1));
		else
			return(ackermann(m - 1, ackermann(m, n - 1)));
	}
}

