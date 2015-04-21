/* Allon Finezilber
   CSC-162
   Lab 2C */

import java.text.DecimalFormat;

public class RoomCarpet
{
    private double carpetCost;
    static DecimalFormat df = new DecimalFormat("$#,##0.00");

	// Default constructor
	// Postcondition: Sets carpetCost to 0
    public RoomCarpet()
    {
        carpetCost = 0;
    }

	// Overloaded constructor
	// Postcondition: Sets values to given variable
    public RoomCarpet(double area)
    {
        setTotalCost(area);
    }

	// Mutator method for carpetCost
    public void setTotalCost(double area)
    {
        this.carpetCost = area * 8.0;
    }

	// Accessor method for carpetCost
    public double getTotalCost()
    {
        return carpetCost;
    }

	// Overridden toString method
    public String toString()
    {
        return ("Price: " + df.format(carpetCost));
    }
}
