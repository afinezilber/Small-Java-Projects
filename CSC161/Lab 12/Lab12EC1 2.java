/* Allon Finezilber
   CSC-161 - C1
   Lab 12C */

import java.util.*;  // Needed for the Scanner Class

// This program will ask the user to input a sentense and determine
// how many vowels are in the string

public class Lab12EC1
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        int row;
        String seat;
        String inputClass, inputSmoking;
        StringBuffer[] planeSeats = new StringBuffer[13];
        planeSeats[0]= new StringBuffer("* * X * X X");
        planeSeats[1]= new StringBuffer("* X * X * X");
        planeSeats[2]= new StringBuffer("* * X X * X");
        planeSeats[3]= new StringBuffer("X * X * X X");
        planeSeats[4]= new StringBuffer("* X * X * *");
        planeSeats[5]= new StringBuffer("* X * * * X");
        planeSeats[6]= new StringBuffer("X * * * X X");
        planeSeats[7]= new StringBuffer("* X * X X *");
        planeSeats[8]= new StringBuffer("X * X X * X");
        planeSeats[9]= new StringBuffer("* X * X X X");
        planeSeats[10]= new StringBuffer("* * X X * X");
        planeSeats[11]= new StringBuffer("* * X X * X");
        planeSeats[12]= new StringBuffer("* * * * X *");

        printMenu(planeSeats, planeSeats.length);

        System.out.println("\nPlease insert what class you would like to sit in");
        System.out.print("First Class or Economy: ");
        inputClass = keyboard.nextLine();

        System.out.println("Please insert the type of seat you want");
        System.out.print("Smoking or Non-Smoking: ");
        inputSmoking = keyboard.nextLine();

        System.out.println("Please insert the seat you want by row  number followed by aisle: ");
        row = keyboard.nextInt();
        seat = keyboard.next();

        getOutput(planeSeats, planeSeats.length, inputClass, inputSmoking, row, seat);


    }

    public static void printMenu(String[] seatList, int noe)
    {
        int i = 0;
        System.out.println("- The following menu shows available seat");
        System.out.println("- Rows 1 and 2 are First Class, 3 - 13 are Economy");
        System.out.println("- Rows 1 - 7 are Non-Smoking seats");
        System.out.println("- * Available Seats | X Assigned Seats\n");
        System.out.println("\t\t\tA B C D E F");
        for(i = 0; i < 9; i++)
            System.out.println("\t\tRow " + (i + 1) + "   " + seatList[i]);
        for(i = 9; i < noe; i++)
            System.out.println("\t\tRow " + (i + 1) + "  " + seatList[i]);

    }

    public static void getOutput
    (String[] seatList1, int noe, String inputClass1, String inputSmoking1, int row1, String seat1)
    {
        int seatValue = 0;
        char seatChar = seat1.charAt(0);
        char newSeat = 'O';
        String newString;

        switch(seatChar)
        {
            case 'A':
            seatValue = 0;
            break;
            case 'B':
            seatValue = 2;
            break;
            case 'C':
            seatValue = 4;
            break;
            case 'D':
            seatValue = 6;
            break;
            case 'E':
            seatValue = 8;
            break;
            case 'F':
            seatValue = 10;
            break;
        }



/*
        int i = 0;
        while(i < seatValue)
        {
            seatList1[row1-1] = (seatList1[row1-1].charAt(i) + " ");
            i = i + 2;

        }

        seatList1[row1-1].charAt(seatValue) = 'O';



        while(seatValue < 10)
        {
            seatValue = seatValue + 2;
            seatList1[row1-1] = (seatList1[row1-1].charAt(i) + " ");

        }

*/

/*       newString = seatList1[row1 - 1];
        newString.setCharAt(seatValue, newSeat);
        System.out.println(newString);
*/

   }




}


        /*if(seatChar == 'A' || 'a')
         seatValue = 0;
        else if(seatChar == 'B' || 'b')
         seatValue = 2;
        else if(seatChar == 'C' || 'c')
         seatValue = 4;
        else if(seatChar == 'D' || 'd')
         seatValue = 6;
        else if(seatChar == 'E' || 'e')
         seatValue = 8;
        else
         seatValue = 10;*/
