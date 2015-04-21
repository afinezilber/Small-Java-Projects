/* Allon Finezilber
   CSC-162
   Lab 1F */


public class TestScore
{

	private double[] scores;
	private double average;

	public TestScore()
	{
		scores = new double[0];
	}

	public TestScore(double[] scores)
	{
		int i = 0;
		this.scores= scores;

		try
		{
			for(i = 0; i < scores.length; i++)
				if(scores[i] < 0 || scores[i] > 100)
					throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Score Found!");
			System.out.println("The value " + String.format("%.2f", scores[i]) + " in position " + i + " is invalid.\n");
		}


	}

	public double getAverage(double[] scores1)
	{
		double sum = 0;
		int i;

		for(i = 0; i < scores1.length; i++)
		{
			sum = sum + scores1[i];
		}

		average = sum / scores1.length;

		return average;
	}

	public String toString()
	{
		return("The average score is: " + String.format("%.2f", average));
	}
}






