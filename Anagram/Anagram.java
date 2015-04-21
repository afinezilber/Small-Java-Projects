import java.util.*;

public class Anagram
{
	public static void main(String args[])
	{
		String str1 = "abcdefg";
		String str2 = "gfedcba";

		char[] array1 = new char[str1.length()];
		char[] array2 = new char[str2.length()];

		if(str1.length() != str2.length())
			System.out.println("This is not an anagram!");

		for(int i = 0; i <= str1.length() - 1; i++)
		{
			array1[i] = str1.charAt(i);
			array2[i] = str2.charAt(i);
		}

		System.out.println("");
		Arrays.sort(array1);
		Arrays.sort(array2);

	    System.out.println("");

		for(int i = 0; i <= array1.length - 1; i++)
		{
			if(array1[i] != array2[i])
			{
				System.out.println("This is not an Anagram!");
				break;
		    }

		    if(i == str1.length() -1)
		      System.out.println("This is an Anagram!");

		}

	}
}
