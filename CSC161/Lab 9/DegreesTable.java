/* Allon Finezilber
   CSC-161 - C1
   Lab 9C */

// This program will

public class DegreesTable
{
    public static void main(String[] args)
    {
        String dashsS1, dashsS2, celciusS, fahrenheitS;
        dashsS1 = "------------------";
        dashsS2 = "---------------------";
        celciusS = "Degrees in Celcius";
        fahrenheitS = "Degrees in Fahrenheit";
        double f = 0.0;
        double c;

        System.out.printf("%n%-21s %-21s%n", fahrenheitS, celciusS);
        System.out.printf("%-21s %-21s%n", dashsS2, dashsS1);

        while(f <= 20.0)
        {
            System.out.printf("%-23.1f", f);
            c = celcius(f);
            System.out.printf("%-23.1f%n", c);

            f++;
        }

        System.out.println();
    }

     public static double celcius(double f1)
     {
         double c1;

         c1 = (5.0/9.0) * (f1 - 32.0);

         return c1;
     }
}
