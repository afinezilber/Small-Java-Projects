/* Allon Finezilber
   CSC-161 - C1
   Lab 7C */
import java.util.Scanner;       // Needed for the scanner
import java.io.*;                // Needed for I/O Class

public class EvenOdd
{
  public static void main(String[] args) throws IOException
  {

    double sumEven = 0.0, sumOdd = 0.0;
    int num;

    // Varifies the file exists
    File file = new File("digits.txt");
    if(!file.exists())
    {
        System.out.println("The file digits.txt was not found!");
        System.exit(0);
    }

    // Opens the file to read input
    Scanner inputFile = new Scanner(file);

    // Reads all of the values from the file and calculates their
    // even and odd sums

    while(inputFile.hasNext())
    {
        num = inputFile.nextInt();
        {
            int n = (num%2);
            if(n == 0)
                sumEven = (sumEven + num);
            else
                sumOdd = (sumOdd + num);
        }
    }

    // Closes the file
    inputFile.close();

    // Displays the sum of the even numbers
    System.out.println("The sum of the even numbers is: " + sumEven);
    // Displays the sum of the odd numbers
    System.out.println("The sum of the odd numbers is :" + sumOdd);
}
}
