/* Allon Finezilber
   CSC-161 - C1
   Lab 12B */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class StudentGrade
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        double avg;

        String[] studentName = new String[50];
        double[] studentGrd = new double[50];
        inputData(studentName, studentName.length, studentGrd);
        avg = getAvg(studentGrd, studentGrd.length);
        getBelowAvg

    }

    public static void inputData(String[] studentList1, int noe, double[] studentGrd1)
    {
        int i = 0;
        System.out.println("Please insert the name of the student followed by their grade:");
        for(i = 0; i < noe; i++)
        {
              studentList1[i] = keyboard.nextLine();
              studentGrd1[i] = keyboard.nextDouble();
              keyboard.nextLine();
              System.out.println(" ");

        }
    }
    public static double getAvg(double[] studentGrd1, int noe)
    {

        int index;
        double sum = 0;

        for(index = 0; index < noe; index++)
          sum = sum + studentGrd1[index];

        return sum;
}
