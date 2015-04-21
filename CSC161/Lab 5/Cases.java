/* Allon Finezilber
   CSC-161 - C1
   Lab 5C */

import java.util.Scanner;        // Needed for the Scanner class.


// This program will ask the user to insert a number from 0 to 35
// and it will output the corresponding letter or number

public class Cases
{
    public static void main(String[] args)
    {

        String numS;
        int num;
        numS = "The number you have entered is equal to: ";

         // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Asks the user to input the number between 0 to 35
        System.out.print("Please insert a number between 0 to 35: ");
        num = keyboard.nextInt();
        // the if statement determining what will be the output of num
        if(0<=num && num<=9)
          System.out.println("\n-" + numS + num + "\n");
        // Switch statement to determine the letter past the input 9
        else
          switch(num)
          {
              case 10:
                 System.out.println("\n-" + numS + "A" + "\n");
                 break;
              case 11:
                 System.out.println("\n-" + numS + "B" + "\n");
                 break;
              case 12:
                 System.out.println("\n-" + numS + "C" + "\n");
                 break;
              case 13:
                 System.out.println("\n-" + numS + "D" + "\n");
                 break;
              case 14:
                 System.out.println("\n-" + numS + "E" + "\n");
                 break;
              case 15:
                 System.out.println("\n-" + numS + "F" + "\n");
                 break;
              case 16:
                 System.out.println("\n-" + numS + "G" + "\n");
                 break;
              case 17:
                 System.out.println("\n-" + numS + "H" + "\n");
                 break;
              case 18:
                 System.out.println("\n-" + numS + "I" + "\n");
                 break;
              case 19:
                 System.out.println("\n-" + numS + "J" + "\n");
                 break;
              case 20:
                 System.out.println("\n-" + numS + "K" + "\n");
                 break;
              case 21:
                 System.out.println("\n-" + numS + "L" + "\n");
                 break;
              case 22:
                 System.out.println("\n-" + numS + "M" + "\n");
                 break;
              case 23:
                 System.out.println("\n-" + numS + "N" + "\n");
                 break;
              case 24:
                 System.out.println("\n-" + numS + "O" + "\n");
                 break;
              case 25:
                 System.out.println("\n-" + numS + "P" + "\n");
                 break;
              case 26:
                 System.out.println("\n-" + numS + "Q" + "\n");
                 break;
              case 27:
                 System.out.println("\n-" + numS + "R" + "\n");
                 break;
              case 28:
                 System.out.println("\n-" + numS + "S" + "\n");
                 break;
              case 29:
                 System.out.println("\n-" + numS + "T" + "\n");
                 break;
              case 30:
                 System.out.println("\n-" + numS + "U" + "\n");
                 break;
              case 31:
                 System.out.println("\n-" + numS + "V" + "\n");
                 break;
              case 32:
                 System.out.println("\n-" + numS + "W" + "\n");
                 break;
              case 33:
                 System.out.println("\n-" + numS + "X" + "\n");
                 break;
              case 34:
                 System.out.println("\n-" + numS + "Y" + "\n");
                 break;
              case 35:
                 System.out.println("\n-" + numS + "Z" + "\n");
                 break;
              default:
                 System.out.println("That is not a number between 0 to 35!");
             }
         }
     }


