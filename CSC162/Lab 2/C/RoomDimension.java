/* Allon Finezilber
   CSC-162
   Lab 2C */

import java.text.DecimalFormat;
public class RoomDimension
{
    private double length;
    private double width;
    private double area;
    static DecimalFormat df = new DecimalFormat("#0.00");

	// Default constructor
	// Postcondition: Sets length, width and area to 0
    public RoomDimension()
    {
        setLength(0.0);
        setWidth(0.0);
        setArea(0.0, 0.0);
    }

	// Overloaded constructed
	// Postcondition: Sets values for legnth, width and area
    public RoomDimension(double length, double width)
    {
        setLength(length);
        setWidth(width);
        setArea(length, width);
    }

	// Mutator method for length
    public void setLength(double length)
    {
        this.length = length;
    }

	// Mutator method for width
    public void setWidth(double width)
    {
        this.width = width;
    }

	// Accessor method for length
    public double getLength()
    {
        return length;
    }

	// Accessor method for width
    public double getWidth()
    {
        return width;
    }

	// Mutator method for area
    public void setArea(double length, double width)
    {
        area = length * width;
    }

	// Accessor method for area
    public double getArea()
    {
        return area;
    }

	//Overridden toString method
    public String toString()
    {
        return ("Length: " + length + "\nWidth: " + width
                + "\nArea: " + df.format(area));
    }
}