/* Allon Finezilber
   CSC-162
   Lab 3C */

public class TeamLeader extends ProductionWorker
{
	double monthlyBonus, requiredTrainingHours, trainingHoursAttended;

	public TeamLeader()
	{
		super();
		monthlyBonus = 0;
		requiredTrainingHours = 0;
		trainingHoursAttended = 0;
	}

	public TeamLeader(String name, String hireDate, int employeeNum, char employeeChar, int shift,
	                  double hourlyPayRate, double monthlyBonus, double requiredTrainingHours,
	                  double trainingHoursAttended)
	{
		super(name, hireDate, employeeNum, employeeChar, shift, hourlyPayRate);
		setMonthlyBonus(monthlyBonus);
		setRequiredTrainingHours(requiredTrainingHours);
		setTrainingHoursAttended(trainingHoursAttended);
	}

	public void setMonthlyBonus(double monthlyBonus)
	{
		this.monthlyBonus = monthlyBonus;
	}

	public void setRequiredTrainingHours(double requiredTrainingHours)
	{
		this.requiredTrainingHours = requiredTrainingHours;
	}

	public void setTrainingHoursAttended(double trainingHoursAttended)
	{
		this.trainingHoursAttended = trainingHoursAttended;
	}

	public double getMonthlyBonus()
	{
		return monthlyBonus;
	}

	public double getRequiredTrainingHours()
	{
		return requiredTrainingHours;
	}

	public double getTrainingHoursAttended()
	{
		return trainingHoursAttended;
	}

	public String toString()
	{
		return(super.toString() + String.format("Monthly Bonus $%,.2f%n", monthlyBonus) +
		String.format("Required Training Hours: %.1f%n", requiredTrainingHours) + String.format("Training Hours Attended: %.1f%n%n", trainingHoursAttended));
	}

}


