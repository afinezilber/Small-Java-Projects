import java.lang.*;
public class RemoveChar
{
	public static void main(String args[])
	{
		String str = "abcaadebfgcca";
		String newStr = str;

		for(int i = 0; i < str.length(); i++)
		{
			for(int j = 1; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					str = str.substring(0, i) + str.substring(i + 1);
			    }
		    }
	    }

		System.out.println(str);


	}
}