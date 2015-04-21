/* Allon Finezilber
   CSC-161 - C1
   Lab 6E */

import javax.swing.JOptionPane; // Needed for the JOptionPane class.


// This program will ask the user to input the mass  in Kilograms of
// an object and it will output its weight in Newtons


public class MassAndWeight
{
    public static void main(String[] args)
    {
       String weightS, weightLow, weightHigh, kgS;
       double kg, gravity, weight;

       gravity = 9.8;
       weightS = "The weight in Newtons of the object is: ";
       weightLow ="The objects weight is under 10 Newtons and is" +
                  " too low to display. \n";
       weightHigh = "The objects weight is over 1000 Newtons and is" +
                    " too high to display. \n";

        // Asks the user to input the kilograms of the object
        kgS = JOptionPane.showInputDialog
        ("Please insert the kilograms of the object:");
        kg = Double.parseDouble(kgS);

        // The conversion to weight to find out Newtons
        weight = kg * gravity;

        //The if else statement to determine the weight in Newtons
        if(weight > 1000.0)
            JOptionPane.showMessageDialog
           (null, weightHigh, "Weight too high!",
            JOptionPane.INFORMATION_MESSAGE);
        else if(weight < 10.0)
            JOptionPane.showMessageDialog
           (null, weightLow, "Weight too low!",
            JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog
           (null, weightS + String.format("%.2f", weight) +
           " Newtons", "Weight in Newtons",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
