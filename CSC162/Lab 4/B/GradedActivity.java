/* Allon Finezilber
   CSC-162
   Lab 1D */

public class GradedActivity
{
	private double score;  // Numeric Score


	public void setScore(double score)
	{
		this.score = score;
	}


	public double getScore()
	{
		return score;
	}



	public char getGrade()
	{
		char letterGrade;

		if(score >= 90)
			letterGrade = 'A';
		else if(score >= 80)
			letterGrade = 'B';
		else if(score >= 70)
			letterGrade = 'C';
		else if(score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';

		return letterGrade;
	}

	public String toString()
	{
		return("Score: " + score + "\nLetter Grade: " + getGrade() + "\n");
	}
}