/* Allon Finezilber
   CSC-161 - C1
   Lab 9B */

// This program will

public class Distance1
{
    public static void main(String[] args)
    {
        double d, tt = 0.0;

        d = distanceFalling(tt);

        System.out.printf("%.2f%n", d);
    }

    public static double distanceFalling(double t1)
    {
        double gravity = 9.8;
        double d, i, j = 10.0;

        for(i = 1.0; i <= j; i++)
        {
            t1++;
        }

        d = (1.0/2.0)*(gravity)*(Math.pow(t1, 2));

        return d;

    }
}



