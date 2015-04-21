/*Allon Finezilber
  CSC-236
  Lab 5*/

public class PlaneDemo
{
	public static void main(String args[])
	{
		QueueClass<Plane> q = new QueueClass<Plane>();
		Plane p1 = new Plane("Aircraft 1", 3);
		Plane p2 = new Plane("Aircraft 2", 1);
		Plane p3 = new Plane("Aircraft 3", 2);

		q.addQueue(p1);
		q.addQueue(p2);
		q.addQueue(p3);

		while(!q.isEmptyQueue())
		{
			System.out.println("Vehicle: ");
			System.out.println(q.front());
			q.deleteQueue();
		}
	}
}