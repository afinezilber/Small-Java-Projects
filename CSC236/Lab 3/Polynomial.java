/*Allon Finezilber
  CSC-236
  Lab 3*/

import java.util.NoSuchElementException;

public class Polynomial
{
	private PolyNode firstNode;
	private PolyNode lastNode;
	private PolyNode temp;
	private PolyNode total;

	public Polynomial(int coef, int exponent)
	{
		temp = new PolyNode(coef, exponent);
		firstNode = temp;
		lastNode = temp;
		firstNode.addLast(lastNode);
	}

	public PolyNode getFirstNode()
	{
		return firstNode;
	}

	public void setFirstNode(PolyNode firstNode)
	{
		this.firstNode = firstNode;
	}

	public boolean isEmpty()
	{
		return firstNode == null;
	}

	public void addFirst(int a, int b)
	{
		temp = new PolyNode(coef, exponent);
		lastNode.addLast(temp);
		lastNode = temp;
    }

 /*   public void addLast(int a, int b)
    {
		if(isEmpty())
		  firstNode = new PolyNode(o, o1, null);

		else
		{
		  PolyNode current = firstNode;

		  while(current.getNext() != null)
			 current = current.getNext();

		  current.setNext(new PolyNode(o, o1, null));
		}
	}*/

 /*   public static Polynomial add(Polynomial p, Polynomial q)
    {
        Polynomial r = new Polynomial();
        double coefficient;
        int exponent;
        PolyNode first = p.firstNode;
        PolyNode second = q.firstNode;
        PolyNode sum = r.firstNode;
        PolyNode term;

        while (first != null && second != null)
            {
                if (first.getExponent() == second.getExponent())
                    {
                        if (first.getCoef() != 0 && second.getCoef() != 0);
                        {
                            Integer addCoeff = new Integer((Integer)first.getCoef() + (Integer)second.getCoef());
                            term = new PolyNode(addCoeff, first.getExponent(), null);
                            sum.setNext(term);
                            first.getNext();
                            second.getNext();
                        }
                    }
                else if ((Integer)first.getExponent() < (Integer)second.getExponent())
                    {
                        sum.setNext(second);
                        term = new PolyNode(second.getCoef(),second.getExponent(), null);
                        sum.setNext(term);
                        second.getNext();
                    }
                else
                    {
                        sum.setNext(first);
                        term = new PolyNode(first.getCoef(), first.getExponent(), first.getNext());
                        sum.setNext(term);
                        first.getNext();
                    }
            }
        while (first != null)
            {
                sum.setNext(first);
            }
        while (second != null)
            {
                sum.setNext(second);
            }
        return r;
    }


*/




	public static PolyNode addPoly(PolyNode poly1, PolyNode poly2, PolyNode p)
	{


		if((Integer)poly1.getExponent() == (Integer)poly2.getExponent())
		{
			p.setCoef((Integer)poly1.getCoef() + (Integer)poly2.getCoef());
			p.setExponent((Integer)poly1.getExponent());
			p.setNext(addPoly(poly1.getNext(), poly2.getNext(), p));
		}
		else if((Integer)poly1.getExponent() > (Integer)poly2.getExponent())
		{
			p.setCoef(poly1.getCoef());
			p.setExponent(poly1.getExponent());
			p.setNext(addPoly(poly1.getNext(), poly2, p));
		}
		else
		{
            p.setCoef(poly2.getCoef());
			p.setExponent(poly2.getExponent());
			p.setNext(addPoly(poly1, poly2.getNext(), p));
		}


		return p;
	}


    public String toString()
    {
		if(isEmpty())
		 return "Empty.";

		else
		{
			String s = "";
			PolyNode current = firstNode;
			while(current != null)
			{
				s = s + current.getCoef() + "";
				current = current.getNext();
			}

		return s;
	    }
	}
}