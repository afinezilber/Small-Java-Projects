/* Allon Finezilber
   CSC-161 - C1
   Lab 11A */

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class ArraySplit
{
    public static void main(String[] args)
    {

        double[] alpha = new double[50];
        getSquare(alpha);
        getTimesThree(alpha);

    }

    public static void getSquare(double[] alphaSquare)
    {
        int i = 0;

        for(i = 0; i < 10; i++)
        {
            alphaSquare[i] = i * i;
            System.out.printf("%-6.2f ", alphaSquare[i]);
        }

        System.out.println(" ");

        for(i = 10; i < 20; i++)
        {
            alphaSquare[i] = i * i;
            System.out.printf("%-6.2f ", alphaSquare[i]);
        }

        System.out.println(" ");

        for(i = 20; i < 25; i++)
        {
            alphaSquare[i] = i * i;
            System.out.printf("%-6.2f ", alphaSquare[i]);;
        }
    }

    public static void getTimesThree(double[] alphaTimesThree)
    {

        int i = 0;

        for(i = 25; i < 30; i++)
        {
            alphaTimesThree[i] = i * 3;
            System.out.printf("%-6.2f ", alphaTimesThree[i]);
        }

        System.out.println(" ");

        for(i = 30; i < 40; i++)
        {
            alphaTimesThree[i] = i * 3;
            System.out.printf("%-6.2f ", alphaTimesThree[i]);
        }

        System.out.println(" ");

        for(i = 40; i < 50; i++)
        {
            alphaTimesThree[i] = i * 3;
            System.out.printf("%-3.2f ", alphaTimesThree[i]);
        }

        System.out.println(" ");

    }
}
