/* Allon Finezilber
   CSC-162
   Lab 2D*/

public class CourseGrade implements Analyzable
{
	final private int NOG = 4;
	private GradedActivity gradesArray[];

	public CourseGrade()
	{
		gradesArray = new GradedActivity[NOG];
	}

	public void setLab(GradedActivity lab)
	{
		gradesArray[0] = lab;
	}

	public void setPassFailExam(GradedActivity passFailExam)
	{
		gradesArray[1] = passFailExam;
	}

	public void setEssay(GradedActivity essay)
	{
		gradesArray[2] = essay;
	}

	public void setFinalExam(GradedActivity finalExam)
	{
		gradesArray[3] = finalExam;
	}

	public double getAverage()
	{
		double sum = 0;
		int i;

		for(i = 0; i < NOG; i++)
		{
			sum = sum + gradesArray[i].getScore();
		}

		return sum / 4.0;
	}

	public GradedActivity getHighest()
	{
		double highest = gradesArray[0].getScore();
		int i;
		int count = 0;

		for(i = 1; i < NOG; i++)
		{
			if(gradesArray[i].getScore() > highest)
			{
				highest = gradesArray[i].getScore();
				count = i;
			}

		}

		return gradesArray[count];

	}

	public GradedActivity getLowest()
	{
		double lowest = gradesArray[0].getScore();
		int i;
		int count = 0;

		for(i = 1; i < NOG; i++)
		{
			if(gradesArray[i].getScore() < lowest)
			{
				lowest = gradesArray[i].getScore();
				count = i;
			}
		}

		return gradesArray[count];
	}



	public String toString()
	{
		return("Lab: \n" + gradesArray[0].toString() + "\nPass/Fail Exam: \n"
			  + gradesArray[1].toString() + "\nEssay: \n" + gradesArray[2].toString()
			  + "\nFinal Exam: \n" + gradesArray[3].toString() + "\nAverage:\n" + getAverage() +
			  "\n\nHighest Score:\n" + getHighest() + "\nLowest Score:\n" + getLowest());
	}
}