/*Allon Finezilber
  CSC-236
  Lab 3*/


public class PolynomialDemo
{
    public static void main(String args[])
    {

            Polynomial poly1 = new Polynomial();
            Polynomial poly2 = new Polynomial();
            Polynomial poly3 = new Polynomial();

			System.out.println("Polynomial Calcualtor");
			System.out.println("---------------------");
			System.out.println();

            poly1.insert(4,3);
            poly1.insert(3,2);
            poly1.insert(-5,0);
            poly2.insert(5,2);
            poly2.insert(3,1);
            poly2.insert(2,0);
            System.out.println("First Polynomial:");
            poly1.printPoly();
            System.out.println();
            System.out.println("Second Polynomial:");
            poly2.printPoly();
            System.out.println();
            System.out.println("Polynomials Added Together:");
            poly3.add(poly1,poly2);
            poly3.printPoly();
            System.out.println();

        }

}