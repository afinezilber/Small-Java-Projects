/* Allon Finezilber
   CSC-161 - C1
   Lab 2B */

   // This program is going to display my First, middle and last night ontop
   // it will also display my first, middle and last initial letters.

public class Fullname
{
    public static void main(String[] args)
    {
        String firstName, middleName, lastName;             // Variables for first middle and last names
        char firstInitial, middleInitial, lastInitial;      // Variables for my first middle and last initials

        firstName = "Allon";
        middleName = "Sheffer";
        lastName = "Finezilber";
        firstInitial = 'A';
        middleInitial = 'S';
        lastInitial = 'F';

        // Display my full name and my full initials.
        System.out.println("My full name is: " + firstName + " " + middleName + " " + lastName + ".");
        System.out.println("My full initials are: " + firstInitial + "." + middleInitial + "." + lastInitial);
    }
}
