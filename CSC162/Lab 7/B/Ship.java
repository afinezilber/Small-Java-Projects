/* Allon Finezilber
   CSC-162
   Lab 7B */


public class Ship
{
	private String shipName;
	private String shipYear;

	public Ship()
	{
		shipName = "";
		shipYear = "";
	}

	public Ship(String shipName, String shipYear)
	{
		setShipName(shipName);
		setShipYear(shipYear);
	}

	public void setShipName(String shipName)
	{
		this.shipName = shipName;
	}

	public void setShipYear(String shipYear)
	{
		this.shipYear = shipYear;
	}

	public String getShipName()
	{
		return shipName;
	}

	public String getShipYear(String shipYear)
	{
		return shipYear;
	}

	public String toString()
	{
		return("Ship Name: " + shipName + "\nShip Year: " + shipYear);
	}
}