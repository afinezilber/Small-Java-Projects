/* Allon Finezilber
   CSC-162
   Lab 7B */


public class ShipDemo
{
	public static void main(String args[])
	{
		Ship[] ship = new Ship[3];

		Ship ship1 = new Ship("Lolipop", "1960");
		CruiseShip ship2 = new CruiseShip("DisneyMagic", "1988", 2400);
		CargoShip ship3 = new CargoShip("Black Peal", "1800", 50000);

		ship[0] = ship1;
		ship[1] = ship2;
		ship[2] = ship3;

		for(int i = 0; i < ship.length; i++)
		{
			System.out.println(ship[i] + "\n");
		}


	}
}