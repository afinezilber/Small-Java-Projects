/*Allon Finezilber
  CSC-236
  Lab 5*/

import java.util.Random;

public class MCCAirport
{
	public static void main(String args[])
	{
		final double LANDING_TIME = 3;
		final double TAKE_OFF_TIME = 2;
		final double LANDING_RATE = 10;
		final double TAKE_OFF_RATE = 10;
		final int ITERATION = 1440;
		double landingWait = 0;
		double takeoffWait = 0;
		double countL = 0.0;
		double countT = 0.0;

		QueueClass<String> landing = new QueueClass<String>(ITERATION);
		QueueClass<String> takeoff = new QueueClass<String>(ITERATION);

		for(int i = 0; i < ITERATION; i++)
		{
			Random g1 = new Random(System.currentTimeMillis());
			Random g2 = new Random(System.currentTimeMillis());
			double l = g1.nextDouble();
			double t = g2.nextDouble();

			if(l < LANDING_RATE/60)
			{
				landing.enqueue("Landing arrival!");
				countL++;
			}

			if(t < TAKE_OFF_RATE/60)
			{
				takeoff.enqueue("Takeoff arrival!");
				countT++;
		    }


		   	while(landing.peek() != null)
		   	{
				landing.dequeue();
				landingWait = landingWait + LANDING_TIME;
			}

			while(takeoff.peek() != null)
			{
				takeoff.dequeue();
				takeoffWait = takeoffWait + TAKE_OFF_TIME;
			}

		}

		System.out.print("The average landing queue length is: ");
		System.out.printf("%.6f%n", (countL / ITERATION));
		System.out.print("The average take off queue length is: ");
		System.out.printf("%.6f%n", (countT /  ITERATION));
		System.out.print("The average landidng queue time is: ");
		System.out.printf("%.6f%n", (landingWait / ITERATION));
		System.out.print("The average take off queue time is : ");
		System.out.printf("%.6f%n", (takeoffWait / ITERATION));
	}
}