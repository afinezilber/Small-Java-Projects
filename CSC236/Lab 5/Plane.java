/*Allon Finezilber
  CSC-236
  Lab 5*/

public class Plane implements Comparable
{
	private String planeName;
	private int priority;

	public Plane(String planeName, int priority)
	{
		this.planeName = planeName;
		this.priority = priority;
	}

	public int compareTo(Object o)
	{

		Plane p = (Plane) o;

		if(priority < p.priority)
			return -1;

		else if(priority > p.priority)
			return 1;

		else
			return 0;
	}

	public String toString()
	{
		return(planeName + "with priority" + priority);
	}
}