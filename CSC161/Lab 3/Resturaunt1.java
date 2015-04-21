/* Allon Finezilber
   CSC-161 - C1
   Lab 3F */

import javax.swing.JOptionPane;  // Needed for the
                                 // JOption class.

// This program will calculate the  price
// tip and tax of a resturaunt bill and
// display it

public class Resturaunt1
{
    public static void main(String[] args)
    {

          // Variables
          String billString;
          double tax, tip, bill;

          tax = 0.0675;
          tip = 0.15;


          // Asks user price of bill
          billString = JOptionPane.showInputDialog
          ("How much was the bill for the meal?");
          bill = Double.parseDouble(billString);

          // Calculations for the tip, tax and total
          double tax1 = bill * tax;
          double tip1 = bill * tip;
          double total = (tip1 + tax1) + bill;


          // Displays the results
          JOptionPane.showMessageDialog
          (null, "The bill amount is : $" + bill +
           "\n" + "The tax on the food is: $"
           + String.format("%.2f",tax1) +
           "\n" + "The amount of tip needed to leave is: $"
           + String.format("%.2f",tip1)
           + "\n" + "The bill total including tax and"
           + " tip is: $" + String.format("%.2f",total));

           System.exit(0);

     }
}

