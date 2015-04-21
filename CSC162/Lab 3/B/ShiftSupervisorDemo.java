/* Allon Finezilber
   CSC-162
   Lab 3B2*/

public class ShiftSupervisorDemo
{
   public static void main(String args[])
   {

	ShiftSupervisor employee1 = new ShiftSupervisor("John Smith", "11-15-2005" ,123 ,'A' , 48000, 6500);
	ShiftSupervisor employee2 = new ShiftSupervisor();

	employee2.setName("Joan Jones");
	employee2.setEmployeeNum(222);
	employee2.setEmployeeChar('L');
	employee2.setHireDate("12-12-2005");
	employee2.setAnnualSalary(55000);
	employee2.setAnnualProduction(8000);

	System.out.println(employee1);
	System.out.println(employee2);

   }
}