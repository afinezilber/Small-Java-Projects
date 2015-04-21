/* Allon Finezilber
   CSC-162
   Lab 2C */

// This program will ask the user to input legnth and width of a room
// and the program will calculate carpet price based on calculated
// area and display the results

import java.util.Scanner;

public class CarpetCalculator
{
   public static void main(String args[])
   {

       double length;
       double width;
       double area;

       Scanner keyboard = new Scanner(System.in);

	   // Asks the user for input
       System.out.println("Please insert the length of the room: ");
       length = keyboard.nextDouble();
       System.out.println();
       System.out.println("Please insert the width of the room: ");
       width = keyboard.nextDouble();
       System.out.println();

	   // Creates the obj1 object
       RoomDimension obj1 = new RoomDimension(length, width);

       area = obj1.getArea();

	   // Creates the obj2 object
       RoomCarpet obj2 = new RoomCarpet(area);
       System.out.println(obj1);
       System.out.println(obj2);
       System.out.println();
   }
}