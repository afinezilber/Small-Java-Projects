/* Allon Finezilber
   CSC-162
   Lab 3F */


public class RetailItem
{
	private String description;
	private int units;
	private double price;

	public RetailItem()
	{
		description = "";
		units = 0;
		price = 0.0;
	}

	public RetailItem(String description, int units, double price)
	{
		setDescription(description);
		setUnitsOnHand(units);
		setPrice(price);
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setUnitsOnHand(int units)
	{
		this.units = units;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getDescription(String description)
	{
		return description;
	}

	public int getUnitsOnHand(int units)
	{
		return units;
	}

	public double getPrice(double price)
	{
		return price;
	}

	public String toString()
	{
		return("Item: " + description + "\nUnits: " + units + "\nPrice: " + String.format("%,.2f", price));
	}
}