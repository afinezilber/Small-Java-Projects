/* Allon Finezilber
   CSC-162
   Lab 1C */

import javax.swing.JOptionPane;

// This program will calculate the charges for paint per gallon and labor

public class PaintJob
{
    public static void main(String[] args)
    {
        String roomsString;
        int rooms, sqrFt;
        double gallons, cost, labor, laborCharge, total;

        // Asks user for number of rooms
        roomsString = JOptionPane.showInputDialog
        			 ("How many rooms are to be painted?");
        rooms = Integer.parseInt(roomsString);

        sqrFt = getSqrFt(rooms);
        gallons = getGallons(sqrFt);
        labor = getLabor(gallons);
        cost = getCost(gallons);
        laborCharge = getLaborCharge(labor);
        total = getTotal(cost, laborCharge);

        JOptionPane.showMessageDialog
        (null, String.format
        ("The total of all charges for paint and labor is: $%.2f",total),
         "Total Price", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);



    }

    public static int getSqrFt(int rooms1)
    {
        int i, sqrFtTotal = 0, sqrFt = 0;
        String sqrFtString;


        for(i = 1; i <= rooms1; i++)
        {
          sqrFtString = JOptionPane.showInputDialog
          			   ("Please enter square feet of room " + i);
          sqrFt = Integer.parseInt(sqrFtString);
          sqrFtTotal = sqrFtTotal + sqrFt;
        }

        return sqrFtTotal;
    }

    public static double getGallons(int sqrFt1)
    {
        double wall = 115;
        double gallons1;

        gallons1 = sqrFt1 / wall;

        return gallons1;

    }

    public static double getLabor(double gallons1)
    {
        double laborTotal, hours = 8;


        laborTotal = gallons1 * hours;

        return laborTotal;

    }

    public static double getCost(double gallons2)
    {
        String priceString;
        double price, totalCost;

        priceString = JOptionPane.showInputDialog
        			 ("What is the price of the paint per gallon?");
        price = Double.parseDouble(priceString);

        totalCost = gallons2 * price;

        return totalCost;

    }

    public static double getLaborCharge(double labor1)
    {
        double totalLabor, fee = 18;
        totalLabor = labor1 * fee;

        return totalLabor;
    }

    public static double getTotal(double cost1, double laborCharges1)
    {
        double total;

        total = cost1 + laborCharges1;

        return total;
    }





}

