/* Allon Finezilber
   CSC-161 - C1
   Lab 12A */

import java.util.Scanner;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class Election1
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] nameList = new String[5];
        double[] voteList = new double[5];
        double[] percentList = new double[5];

        inputData(nameList, nameList.length, voteList);
        double sum = getSum(voteList, voteList.length);
        outputData(nameList, nameList.length, voteList, percentList, sum);
        getWinner(nameList, nameList.length, voteList);


    }

    public static void inputData(String[] nameList1, int noe, double[] voteList1)
    {
        int i;
        System.out.println("Please insert the name of the canidates followed by their votes:");
        for(i = 0; i < noe; i++)
        {
         nameList1[i] = keyboard.nextLine();
         voteList1[i] = keyboard.nextDouble();
         keyboard.nextLine();
         System.out.println(" ");
        }
    }

    public static double getSum(double[] voteList1, int noe)
    {
        int index;
        double sum = 0.0;

        for(index = 0; index < noe; index++)
          sum = sum + voteList1[index];

        return sum;
    }

    public static void outputData(String[] nameList1, int noe, double[] voteList1, double[] percentList1, double sum1)
    {
        int i;
        String total, candidate, votesRec, totVotes, dash1, dash2;
        total = "Total";
        candidate = "Candidate";
        votesRec = "Votes Received";
        totVotes = "  % of Total Votes";
        dash1 =    "---------";
        dash2 =    "----------------";


        System.out.println("\n");
        System.out.printf("%-10s %-10s %-13s%n", candidate, votesRec, totVotes);
        System.out.printf("%-10s %-10s %-13s%n", dash1, dash2, dash2);
        for(i = 0; i < noe; i++)
           {
               System.out.printf("%-15s", nameList1[i]);
               System.out.printf("%-15.0f", voteList1[i]);
               percentList1[i] = (voteList1[i] / sum1) * 100.0;
               System.out.printf("%-15.2f", percentList1[i]);
               System.out.println("\n");
           }
           System.out.printf("%-14s %-14.0f %n", total, sum1);
           System.out.println(" ");
    }

    public static void getWinner(String[] nameList1, int noe, double[] voteList1)
    {
        System.out.println("The Winner of MCC Election is: " + nameList1[getLargest(voteList1, voteList1.length)]);
        System.out.println(" ");
    }

    public static int getLargest(double[] voteList1, int noe)
    {
        int index;
        int maxIndex = 0;

        for(index = 1; index < noe; index++)
          if(voteList1[maxIndex] < voteList1[index])
          maxIndex = index;

        return maxIndex;

    }
}
