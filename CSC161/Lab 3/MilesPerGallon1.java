/* Allon Finezilber
   CSC-161 - C1
   Lab 3B */

import javax.swing.JOptionPane;  // Needed for the
                                 // JOption class.

// This program will calculate a cars MPG

public class MilesPerGallon1
{
    public static void main(String[] args)
    {
        String milesString, gallonsString;
        double gallons, miles, mpg;

        milesString = JOptionPane.showInputDialog
        ("How many miles have you driven?");
        miles = Double.parseDouble(milesString);

        gallonsString = JOptionPane.showInputDialog
        ("How many gallons did you use?");
        gallons = Double.parseDouble(gallonsString);

        // Calculate the MPG
        mpg = miles / gallons;

        // Display the MPG
        JOptionPane.showMessageDialog
        (null, "Your car drives at a rate of " +
         String.format("%.1f",mpg)
         + " miles per gallon.");

        System.exit(0);

     }
}
