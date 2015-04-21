  /* Allon Finezilber
   CSC-162
   Lab 2BA */

// This program will ask the user to input a tempature and the program
// will determine whether water, oxygen or ethyl alcohol boils or freezes
// at that certain tempature

import java.util.Scanner;
import java.text.DecimalFormat;

public class Substances
{
   static DecimalFormat df = new DecimalFormat("#0.00");
   static Scanner keyboard = new Scanner(System.in);
   static double temp;
   static boolean ethylF, oxygenF, waterF;
   static boolean ethylB, oxygenB, waterB;
   static FreezeBoil obj;

   public static void main(String args[])
   {

      System.out.println("Please insert a tempature: ");
      temp = keyboard.nextDouble();

      FreezeBoil obj = new FreezeBoil(temp);

      ethylF = obj.isEthylFreezing(temp);
      ethylB = obj.isEthylBoiling(temp);
      oxygenF = obj.isOxygenFreezing(temp);
      oxygenB = obj.isOxygenBoiling(temp);
      waterF = obj.isWaterFreezing(temp);
      waterB = obj.isWaterBoiling(temp);

      output();
   }

   // Method that displays the type of substance and its state
   // based on input tempature
   public static void output()
   {
       System.out.println();
       System.out.println("Inserted Tempature: " + df.format(temp) + "\n");

       if(ethylF == true)
         System.out.println("Ethyl Alcohol Freezes at this tempature.");

       if(ethylB == true)
         System.out.println("Ethyl Alcohol Boils at this tempature.");

       if(oxygenF == true)
         System.out.println("Oxygen Freezes at this tempature.");

       if(oxygenB == true)
         System.out.println("Oxygen Boils at this tempature.");

       if(waterF == true)
         System.out.println("Water Freezes at this tempature.");

       if(waterB == true)
         System.out.println("Water Boils at this tempature.");

       System.out.println();

   }
}








