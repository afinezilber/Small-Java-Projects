/* Allon Finezilber
   CSC-162
   Lab 4F */


public class WorkerDemo
{
    public static void main(String[] args)
    {

		createWorker();

	}

	public static void createWorker()
	{

		ProductionWorker worker4 = new ProductionWorker();
		ProductionWorker worker1 = new ProductionWorker();
		ProductionWorker worker2 = new ProductionWorker();
		ProductionWorker worker3 = new ProductionWorker();


		try
		{

			worker4.setName("John Smith");
			worker4.setHireDate("11-15-2009");
			worker4.setShift(1);
			worker4.setHourlyPayRate(16.50);
			worker4.setEmployeeNum(123);

			System.out.println(worker4);

		}
		catch(InvalidEmployeeNumber e4Ref)
		{
			System.out.println(worker4.getName());
			System.out.println(worker4.getHireDate());
			System.out.println(e4Ref);
			if(worker4.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(String.format("%.2f",worker4.getHourlyPayRate()));

		}

		catch (InvalidShift e44Ref)
		{
			System.out.println(worker4.getName());
			System.out.println(worker4.getHireDate());
			System.out.println(e44Ref);
			if(worker4.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(String.format("%.2f",worker4.getHourlyPayRate()));
		}

		catch(InvalidPayRate e444Ref)
		{
			System.out.println(worker4.getName());
			System.out.println(worker4.getHireDate());
			System.out.println(e444Ref);
			if(worker4.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(String.format("%.2f",worker4.getHourlyPayRate()));
		}

		System.out.println();

		try
		{

			worker1.setName("John Smith");
			worker1.setHireDate("11-15-2009");
			worker1.setShift(1);
			worker1.setHourlyPayRate(16.50);
			worker1.setEmployeeNum(10001);

			System.out.println(worker1);

		}
		catch(InvalidEmployeeNumber e1Ref)
		{
			System.out.println(worker1.getName());
			System.out.println(worker1.getHireDate());
			System.out.println(e1Ref);
			if(worker3.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(String.format("%.2f",worker1.getHourlyPayRate()));

		}

		catch (InvalidShift e11Ref)
		{
			System.out.println(worker1.getName());
			System.out.println(worker1.getHireDate());
			System.out.println(e11Ref);
			if(worker3.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(String.format("%.2f",worker1.getHourlyPayRate()));
		}

		catch(InvalidPayRate e111Ref)
		{
			System.out.println(worker1.getName());
			System.out.println(worker1.getHireDate());
			System.out.println(e111Ref);
			if(worker3.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(String.format("%.2f",worker1.getHourlyPayRate()));
		}


		System.out.println("\n");

		try
		{
			worker2.setName("John Smith");
			worker2.setHireDate("11-15-2009");
			worker2.setHourlyPayRate(16.50);
			worker2.setEmployeeNum(123);
			worker2.setShift(66);
			System.out.println(worker2);
		}

		catch(InvalidShift e2Ref)
		{
			System.out.println(worker2.getName());
			System.out.println(worker2.getHireDate());
			System.out.println(worker2.getEmployeeNum());
			System.out.println(e2Ref);
			System.out.println(String.format("%.2f", worker2.getHourlyPayRate()));

		}
		catch(InvalidEmployeeNumber e22Ref)
		{
			System.out.println(worker2.getName());
			System.out.println(worker2.getHireDate());
			System.out.println(worker2.getEmployeeNum());
			System.out.println(String.format("%.2f", worker2.getHourlyPayRate()));
			System.out.println(e22Ref);
		}
		catch(InvalidPayRate e222Ref)
		{
			System.out.println(worker2.getName());
			System.out.println(worker2.getHireDate());
			System.out.println(worker2.getEmployeeNum());
			System.out.println(String.format("%.2f", worker2.getHourlyPayRate()));
			System.out.println(e222Ref);
		}

		System.out.println("\n");

		try
		{

			worker3.setName("John Smith");
			worker3.setHireDate("11-15-2009");
			worker3.setEmployeeNum(123);
			worker3.setShift(1);
			worker3.setHourlyPayRate(-99.00);

			System.out.println(worker3);
		}
		catch(InvalidPayRate e3Ref)
		{
			System.out.println(worker3.getName());
			System.out.println(worker3.getHireDate());
			System.out.println(worker3.getEmployeeNum());
			if(worker3.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(e3Ref);
		}
		catch(InvalidEmployeeNumber e33Ref)
		{
			System.out.println(worker3.getName());
			System.out.println(worker3.getHireDate());
			System.out.println(worker3.getEmployeeNum());
			if(worker3.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(e33Ref);
		}
		catch(InvalidShift e333Ref)
		{
			System.out.println(worker3.getName());
			System.out.println(worker3.getHireDate());
			System.out.println(worker3.getEmployeeNum());
			if(worker3.getShift() == 1)
				System.out.println("Day Shift");
			else
				System.out.println("Night Shift");
			System.out.println(e333Ref);
		}

	}


}