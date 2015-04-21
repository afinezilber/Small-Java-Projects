/* Allon Finezilber
   CSC-161 - C1
   Lab 2C */

   // This program will display my Name, Address, Telephone and Major in single println

public class Information
{
    public static void main(String[] args)
    {

        String name, address, telephone, major;     // Variable information
        name = "Allon Finezilber";
        address = "189 Taylor Ave, East Brunswick, NJ 08816";
        telephone = "732-247-0108";
        major = "Computer Science";


        // Displays my Name, Address, Telephone and Major
        System.out.print("My name is " + name + "\nMy address is: " + address + "\nMy telephone number is: " + telephone +
                         "\nMy major is: " + major);
        System.out.println(" ");
    }
}
