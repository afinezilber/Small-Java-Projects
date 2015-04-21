/*Allon Finezilber
  CSC-236
  Lab 3*/

public class PolynomialTest
{
	public static void main(String args[])
	{
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		Polynomial p3;

        p1.addFirst((Integer)4, (Integer)3);
		p1.addLast((Integer)3, (Integer)2);
		p1.addLast((Integer)1, (Integer)1);
		p1.addLast((Integer)1, (Integer)0);
		p2.addFirst((Integer)1, (Integer)3);
		p2.addLast((Integer)2, (Integer)1);
		p2.addLast((Integer)2, (Integer)0);

		p3 = Polynomial.
		addPoly(p1, p2);
		System.out.println(p3);
	}
}