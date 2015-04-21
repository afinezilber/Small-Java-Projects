/* Allon Finezilber
   CSC-162
   Lab 7B */


public class CruiseShip extends Ship
{
	private int passangers;

	public CruiseShip()
	{
		super();
		passangers = 0;
	}

	public CruiseShip(String shipName, String shipYear, int passangers)
	{
		super(shipName, shipYear);
		setPassangers(passangers);
	}

	public void setPassangers(int passangers)
	{
		this.passangers = passangers;
	}

	public int getPassangers()
	{
		return passangers;
	}

	public String toString()
	{
		return(super.toString() + "\nMaximum Passangers: " + String.format("%,d", passangers));
	}
}
