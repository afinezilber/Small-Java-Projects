/* Allon Finezilber
   CSC-162
   Lab 2A2 */

// This program will read display inventory information of a product,
// its price and quantity currently in storage

public class RetailItemDemo
{
   public static void main(String args[])
   {
       int unitsOnHand;
       double price;
       String description;

	   // Creation of objects
       RetailItem item1 = new RetailItem();
       RetailItem item2 = new RetailItem(40, 34.95, "Designer Jeans");
       RetailItem item3 = new RetailItem();

	   // initializing item1 object with values
       item1.setPrice(59.95);
       item1.setUnits(12);
       item1.setDescription("Jackets");

	   // initializing item3 object with values
       item3.setPrice(24.95);
       item3.setUnits(20);
       item3.setDescription("Shirts");


       System.out.println("Inventory Information");
       System.out.println("---------------------");
       System.out.println(item1);
       System.out.println();
       System.out.println(item2);
       System.out.println();
       System.out.println(item3);
       System.out.println();

   }
}