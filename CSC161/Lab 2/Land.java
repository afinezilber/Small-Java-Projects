/* Allon Finezilber
   CSC-161 - C1
   Lab 2G */

   // This program will calculate two numbers and display their sum.

public class Land
{
    public static void main(String[] args)
    {

        int acres, tract;       // The variables for the value of an acre and the total square feet in the tract
        double totalacre;

        acres = 43560;
        tract = 389767;
        totalacre = tract / acres;


        // The calculation of how many acres are in the tract
        System.out.println("There are " + tract + " square feet of land in a tract.");
        System.out.println("The size of one acre is " + acres);
        System.out.println("The amount of acres inside the tract is " + totalacre);
    }
}
