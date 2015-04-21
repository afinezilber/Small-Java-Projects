/* Allon Finezilber
   CSC-161 - C1
   Lab 6A */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask for the user for a number between 1 to 10
// and then will display its numeral value

public class RomanNumeral
{
    public static void main(String[] args)
    {
        String numeralS;
        int num;
        numeralS = "-The roman numeral for the number you input is: ";

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user to insert a number between 1 to 10
        System.out.print("Please enter a number between 1 to 10: ");
        num = keyboard.nextInt();

        // The switch calculation to determine the numeral number
        switch(num)
         {
              case 1:
                 System.out.println("\n" + numeralS + "I" + "\n");
                 break;
              case 2:
                 System.out.println("\n" + numeralS + "II" + "\n");
                 break;
              case 3:
                 System.out.println("\n" + numeralS + "III" + "\n");
                 break;
              case 4:
                 System.out.println("\n" + numeralS + "IV" + "\n");
                 break;
              case 5:
                 System.out.println("\n" + numeralS + "V" + "\n");
                 break;
              case 6:
                 System.out.println("\n" + numeralS + "VI" + "\n");
                 break;
              case 7:
                 System.out.println("\n" + numeralS + "VII" + "\n");
                 break;
              case 8:
                 System.out.println("\n" + numeralS + "VIII" + "\n");
                 break;
              case 9:
                 System.out.println("\n" + numeralS + "IX" + "\n");
                 break;
              case 10:
                 System.out.println("\n" + numeralS + "X" + "\n");
                 break;
              default:
                 System.out.println("\n" + "-That is an invalid number!" + "\n");
                 break;
           }
      }
}