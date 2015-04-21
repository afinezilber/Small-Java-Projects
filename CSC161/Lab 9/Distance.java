/* Allon Finezilber
   CSC-161 - C1
   Lab 9B */

// This program will

public class Distance
{
    public static void main(String[] args)
    {
        double d, t, tt = 1.0;
        double gravity = 9.8;

        t = distanceFalling(tt);

        d = (1.0/2.0)*(gravity)*(Math.pow(t, 2));

        System.out.printf("%.2f%n", d);
    }

    public static double distanceFalling(double t1)
    {
        double i, j;
        j = 10.0;

        for(i = 1.0; i < j; i++)
        {
            t1++;
        }
        return t1;

    }
}



