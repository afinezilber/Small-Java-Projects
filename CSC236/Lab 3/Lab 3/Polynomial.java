/*Allon Finezilber
  CSC-236
  Lab 3*/


public class Polynomial
{
    private PolyList p1;

    public Polynomial()
    {
        p1 = new PolyList();
    }
    public boolean insert(int x,int y)
    {
        Node current = p1.first;
        int pos = 0;
        while(current != null)
        {
            if(current.exp == y)
            {
                System.out.println("Not a valid term. Please check again");
                return false;
            }
            else if(current.exp < y)
                break;
            pos++;
            current = current.next;
        }

        if(pos == 0)
            p1.insertFirst(x, y);
        else
            p1.insertPos(x, y, pos);
        return true;
    }

    public void printPoly()
    {
        int s = 0;
        Node current = p1.first;

        while(current != null)
        {
            if(s != 0 && current.coeff > 0 && current.coeff!= -1)
                System.out.print("+");
            if(current.coeff != 0)
            {
                if(current.coeff > 1 || current.coeff < -1 || current.exp == 0)
                    System.out.print(current.coeff);

                else if(current.coeff == -1)
                    System.out.print("-");

                if(current.exp == 1)
                    System.out.print("X");

                else if(current.exp > 1 || current.exp < 0)
                    System.out.print("X^" + current.exp);
                s = 1;
            }
            current = current.next;
        }

        System.out.println(" ");
    }

    public void add(Polynomial poly1,Polynomial poly2)
    {
        int x, y;
        Node current1 = poly1.p1.first;
        Node current2 = poly2.p1.first;

        while(current1 != null && current2 != null)
        {
            if(current1.exp == current2.exp)
            {
                x=current1.coeff + current2.coeff;
                y=current1.exp;
                current1 = current1.next;
                current2 = current2.next;
            }
            else if(current1.exp > current2.exp)
            {
                x = current1.coeff;
                y = current1.exp;
                current1 = current1.next;
            }
            else
            {
                x = current2.coeff;
                y = current2.exp;
                current2 = current2.next;
            }
            p1.insertLast(x, y);
        }

        while(current1 != null)
        {
            x = current1.coeff;
            y = current1.exp;
            current1 = current1.next;
            p1.insertLast(x, y);
        }

        while(current2!=null)
        {
            x = current2.coeff;
            y = current2.exp;
            current2 = current2.next;
            p1.insertLast(x,y);
        }
    }
}