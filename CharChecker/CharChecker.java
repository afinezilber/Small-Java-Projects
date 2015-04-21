public class CharChecker
{
 public static void main(String args[])
 {
	 String str1 = "abcdeFG";
	 String str2 = str1.toLowerCase();

	 Boolean[] array = new Boolean[26];

	 // Initialize every index in the array to false
	 for(int i = 0; i <= array.length - 1; i++)
	 {
		 array[i] = false;
	 }

	 // Insert the characters into array

	 for(int i = 0; i <= str2.length() - 1; i++)
	 {
		 char c = str2.charAt(i);
		 int value = (int) c;
		 System.out.println(value);

		 if(array[value % 97] == true)
		 {
			 System.out.println("This String does not have all unique characters.");
			 break;
		 }
		 else
		 	array[value % 97] = true;

		 if(i==str2.length()-1)
		 	System.out.println("This string is unique!!! dood! GG");
	  }



 }
}