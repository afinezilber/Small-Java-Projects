/* Allon Finezilber
   CSC-161 - C1
   Lab 10A */

import javax.swing.JOptionPane;  // Needed for the JOptionPane class

// This program will ask the user to input a whole sale price and
// its markup percentage and then output the items retail

public class RetailPriceCalculator
{
    public static void main(String[] args)
    {
        double wholesale = 0.0, percentage = 0.0;

        double retail = calculateRetail(wholesale, percentage);

        // Displays the results
        JOptionPane.showMessageDialog
        (null, "The retail price of the item is : $"
        + String.format("%.2f", retail), "Retail Price",
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static double calculateRetail(double x, double y)
    {

        String xS, yS;

        // Asks user price of for wholesale price
        xS = JOptionPane.showInputDialog
        ("Please insert the whole sale price of the item:");
        x = Double.parseDouble(xS);

        // Asks user for markup percentage
        yS = JOptionPane.showInputDialog
        ("Please insert the percentage markup of the item:");
        y = Double.parseDouble(yS);

        y = (y / 100);

        double z = (x * y) + x;

        return z;
    }
}