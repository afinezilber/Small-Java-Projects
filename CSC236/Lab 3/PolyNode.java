/*Allon Finezilber
  CSC-236
  Lab 3*/

public class PolyNode
{
	private int coef;
	private int exponent;
	private PolyNode next;


	public PolyNode()
	{
		coef = 0;
		exponent = 0;
		next = null;
	}

	public PolyNode(int coef, int exponent)
	{
		this.coef = coef;
		this.exponent = exponent;
		next = null;
	}

	public int getCoef()
	{
		return coef;
	}

	public int getExponent()
	{
		return exponent;
	}

	public PolyNode getNext()
	{
		return next;
	}

	public void setCoef(int coef)
	{
		this.coef = coef;
	}

	public void setExponent(int exponent)
	{
		this.exponent = exponent;
	}

	public void setNext(PolyNode next)
	{
		this.next = next;
	}


	public String toString()
	{
		return(coef + "^" + exponent + " + ");
	}

}