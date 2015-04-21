/* Allon Finezilber
   CSC-162
   Lab 2A */


public class RetailItem
{
    private String description;
    private int unitsOnHand;
    private double price;


    // Default constructor
    // Postcodintion: Sets price and unitsOnHand to 0
    //				  Sets Description to an empty string
    public RetailItem()
    {
        setPrice(0);
        setUnits(0);
        setDescription("");
    }

    // Overloaded Constructor
    // Postcondition: Sets Price and unitsOnHand to given variables
    //				  Sets description to the string variable
    public RetailItem(int units, double cost, String description)
    {
        setUnits(units);
        setPrice(cost);
        setDescription(description);
    }

	// Mutator Method for description
    public void setDescription(String description)
    {
        this.description = description;
    }

	// Mutator Method for price
    public void setPrice(double cost)
    {
        price = cost;
    }

	// Mutator Method for unitsOnHand
    public void setUnits(int units)
    {
        unitsOnHand = units;
    }

	// Accessor method for description
    public String getDescrption()
    {
        return description;
    }

	// Accessor method for price
    public double getPrice()
    {
        return price;
    }

	// Accessor method for unitsOnHand
    public int getUnits()
    {
        return unitsOnHand;
    }

	// Overridden toString method
    public String toString()
    {
        return("Item: " + description + "\nUnits on Hand: "
               + unitsOnHand+ "\nPrice: $" + price);
    }
}