/*Allon Finezilber
  CSC-236
  Lab 3*/


public class Node
{
    public int exp,coeff;
    public Node next;
    public Node(int x,int y)
    {
        coeff = x;
        exp = y;
    }
}


class PolyList
{
    public Node first;
    public PolyList()
    {
        first = null;
    }
    public void insertFirst(int x,int y)
    {
        Node newNode = new Node(x,y);
        newNode.next = first;
        first = newNode;
    }
    public void insertPos(int x,int y,int p)
    {
        Node current = first;
        Node newNode = new Node(x, y);
        for(int i = p;i > 1; i--)
            current = current.next;
        newNode.next = current.next;
        current.next = newNode;
    }
    public void insertLast(int x,int y)
    {
        Node newNode = new Node(x, y);
        newNode.next = null;
        if(isEmpty())
            first = newNode;
        else
        {
            Node current = first;
            while(current.next!=null)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public boolean isEmpty()
    {
        return(first == null);
    }
}