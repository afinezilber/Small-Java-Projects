/* Allon Finezilber
   CSC-162
   Lab 2E */

public class StringReverser
{
   public static void main(String args[])
   {
	   String str = "Good Morning Java";
	   int length = str.length();

	   String reversedStr = strReverse(length, str);
	   System.out.println(reversedStr);


   }

   public static String strReverse(int length, String str)
   {
	   String reversed = "";

	   if(length == 0)
	   	   return reversed;
	   else
	   {
		   reversed = str.charAt(length - 1) + strReverse(length-1, str);
		   return reversed;
	   }
   }

}