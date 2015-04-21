/* Allon Finezilber
   CSC-162
   Lab 3C2*/

public class TeamLeaderDemo
{
   public static void main(String args[])
   {

	TeamLeader leader1 = new TeamLeader("John Smith", "11-15-2005" ,123 ,'A' , 1, 16.5, 500, 5, 2.5);
	TeamLeader leader2 = new TeamLeader();

	leader2.setName("Joan Jones");
	leader2.setEmployeeNum(222);
	leader2.setEmployeeChar('L');
	leader2.setHireDate("12-12-2005");
	leader2.setShift(2);
	leader2.setHourlyPayRate(18.5);
	leader2.setMonthlyBonus(600);
	leader2.setRequiredTrainingHours(7);
	leader2.setTrainingHoursAttended(3.5);

	System.out.println(leader1);
	System.out.println(leader2);
   }
}