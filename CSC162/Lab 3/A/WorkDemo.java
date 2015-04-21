/* Allon Finezilber
   CSC-162
   Lab 3A2*/

public class WorkDemo
{
   public static void main(String args[])
   {

	ProductionWorker employee1 = new ProductionWorker("John Smith", "11-15-2005" ,123 ,'A' , 1, 16.50);
	ProductionWorker employee2 = new ProductionWorker();

	employee2.setName("Joan Jones");
	employee2.setEmployeeNum(222);
	employee2.setEmployeeChar('L');
	employee2.setHireDate("12-12-2005");
	employee2.setShift(2);
	employee2.setHourlyPayRate(18.50);

	System.out.println(employee1);
	System.out.println(employee2);
   }
}


