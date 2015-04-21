/* Allon Finezilber
   CSC-161 - C1
   Lab 3D */

import javax.swing.JOptionPane;  // Needed for the
                                 // JOption class.

// This program will calculate the profit
// the retailer makes from their circuit
// boards

public class CircuitBoard1
{
    public static void main(String[] args)
    {
        // The variables for price and profit
        double price, profit;
        String priceString;

        // Ask user for price of item
        priceString = JOptionPane.showInputDialog
        ("How much was the price of the circuit board?");
        price = Double.parseDouble(priceString);

        // The calculation of the profit
        profit = price * 0.4;

        // Displaying the results
        JOptionPane.showMessageDialog
        (null, "The retail price of the circuit"
         + " is: $" + price + "\n" +
         "The profit the company makes is: $"
         + String.format("%.2f",profit));
    }
}


