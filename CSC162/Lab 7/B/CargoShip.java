/* Allon Finezilber
   CSC-162
   Lab 7B */


public class CargoShip extends Ship
{
	private int weight;

	public CargoShip()
	{
		weight = 0;
	}

	public CargoShip(String shipName, String shipYear, int weight)
	{
		super(shipName, shipYear);
		setWeight(weight);
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getWeight()
	{
		return weight;
	}

	public String toString()
	{
		return(super.toString() + "\nCargo Capacity: " + String.format("%,d", weight) + " tons.");
	}
}