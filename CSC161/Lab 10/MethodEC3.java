/* Allon Finezilber
   CSC-161 - C1
   Lab 10G */

import java.util.Scanner;  // Needed for the Scanner Class
import java.io.*;

public class MethodEC3
{
    public static void main(String[] args) throws IOException
    {

        String answer, student;
        double score;
        char letterG;

         // Varifies the file exists
         File file = new File("AnswerKey.txt");
         if(!file.exists())
         {
           System.out.println("The file AnswerKey.txt was not found!");
           System.exit(0);
         }

         // Opens the file to read input
         Scanner inputFile = new Scanner(file);

         answer = inputFile.nextLine();

         while(inputFile.hasNext())
         {
             score = 0;
             inputFile.nextLine();
             student = inputFile.nextLine();
             for(int i = 0; i <= 19; i++)
                {
                 if(answer.charAt(i) == student.charAt(i + 9))
                      score = score + 2;
                 else if(student.charAt(i + 9) == ' ')
                      score = score + 0;
                 else
                      score = score - 1;
                }

         System.out.println(student + " " + score + " " + examGrade(score));
            }

           inputFile.close();

     }


     public static char examGrade(double score)
     {
         char letter;

         if(score / 40 >= .90)
            letter = 'A';
         else if(score / 40 >= .80)
            letter = 'B';
         else if(score / 40 >= .70)
            letter = 'C';
         else if(score / 40 >= .60)
            letter = 'D';
         else
            letter = 'F';

         return letter;

     }
}
