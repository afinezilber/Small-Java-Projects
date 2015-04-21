/* Allon Finezilber
   CSC-162
   Lab 1D */

import java.util.Scanner;

// This program will test the user for the drivers test exam
// and will display if the user has passed and what questions
// were wrong

public class DriverLicenseExam
{
  static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args)
    {
        boolean pass;
        int i, correct, incorrect;
        char[] answers = new char[20];
        char[] key = new char[]{'B', 'D', 'A', 'A', 'C',
                                'A', 'B', 'A', 'C', 'D',
                                'B', 'C', 'D', 'A', 'D',
                                'C', 'C', 'B', 'D', 'A'};
        System.out.println
        ("*Please insert A, B, C or D for your answers in capital letters*  \n");

        for(i = 0; i < answers.length; i++)
        {
            String letter, a = "A", b = "B", c = "C", d = "D";
            System.out.print(i + 1 + ") ");
            letter = keyboard.nextLine();

            if(letter.equals(a) || letter.equals(b)
               || letter.equals(c) || letter.equals(d))
                answers[i] = letter.charAt(0);
            else
            {
                System.out.println("That is an invalid letter, please"
                				   + " insert a valid letter.");
                System.out.print("   ");
                letter = keyboard.nextLine();
            }

        }

        System.out.println();

        pass = getPassed(key, answers.length, answers);
        correct = getCorrect(key, answers.length, answers);
        incorrect = getIncorrect(key, answers.length, answers);

        System.out.println("The number of questions you have gotten"
        				   + " correctly are: " + correct);
        System.out.println("The number of questions you have gotten"
        				   + " incorrectly are: " + incorrect + "\n");
        questionsMissed(key, answers.length, answers);
        if(pass == true)
         System.out.println("\n\nYou have PASSED!\n");
        else
         System.out.println("\n\nYou have FAILED!\n");


    }

        public static boolean getPassed(char[] key1, int noe, char[] answers1)
        {
            boolean pass1;
            int i, count = 0;

            for(i = 0; i < noe; i++)
            {
                if(key1[i] == answers1[i])
                {
                  count++;
                }
            }

            if(count <15)
             pass1 = false;
            else
             pass1 = true;

            return pass1;
        }

        public static int getCorrect(char[] key1, int noe, char[] answer1)
        {
            int i, count = 0;

            for(i = 0; i < noe; i++)
            {
                if(key1[i] == answer1[i])
                {
                  count++;
                }
            }

            return count;
        }

        public static int getIncorrect(char[] key1, int noe, char[] answer1)
        {
            int i, count = 0;

            for(i = 0; i < noe; i++)
            {
                if(key1[i] != answer1[i])
                {
                    count++;
                }
            }

            return count;
        }

        public static void questionsMissed(char[] key1, int noe, char[] answer1)
        {
            int i;

            System.out.println("The questions you have gotten wrong are: ");
            for(i = 0; i < noe; i++)
            {
                if(key1[i] != answer1[i])
                  System.out.print(i + 1 +", ");
            }
        }

}