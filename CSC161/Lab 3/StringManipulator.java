/* Allon Finezilber
   CSC-161 - C1
   Lab 3E */

import java.util.Scanner;  // Needed for the scanner
                           // class.

// This program will ask for a city name
// and display it in various different ways.

public class StringManipulator
{
    public static void main(String[] args)
    {
        // The different variables for city
        String city, cityl, cityu;

        // Scanner Object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Asks the user their favorite city
        System.out.print("What is the name of your " +
                         "favorite city? ");
        city = keyboard.nextLine();

        // Makes the city name all uppercase
        cityu = city.toUpperCase();

        // Makes the city name all lowercase
        cityl = city.toLowerCase();

        // Counts the number of characters in city
        int cityNum = city.length();

        // Reads the first letter of the city name
        char letter = city.charAt(0);

        // Displays all the outputs of the city name
        System.out.println("There are " + cityNum +
                           " characters in " + city);
        System.out.println(cityu);
        System.out.println(cityl);
        System.out.println("The first character in "
                            + city + " is " + letter);
     }
}