/* Allon Finezilber
   CSC-161 - C1
   Lab 6F */

import javax.swing.JOptionPane; // Needed for the JOptionPane class.


// This program will ask the user to input seconds and the program
// will display what is its equivilent in minutes, days or hours


public class Time
{
    public static void main(String[] args)
    {
        String secondsS;
        double seconds, minutes, hours, days;


        // Asks the user to input the seconds
        secondsS = JOptionPane.showInputDialog
        ("Please insert amount of seconds:");
        seconds = Double.parseDouble(secondsS);

        // Determines if the seconds input is under 60 secs
        if(seconds < 60.0)
        {
            JOptionPane.showMessageDialog
           (null, "You have inserted the amount of seconds!",
           "You know the seconds!",
            JOptionPane.INFORMATION_MESSAGE);
        }
        // Determines if the seconds input is between 60 to 3600 secs
        else if(60 <= seconds && seconds <3600.0)
        {
            minutes = seconds / 60.0;
            JOptionPane.showMessageDialog
           (null, "The amount of seconds inserted is equal to "
           + String.format("%.2f", minutes) + " minutes.",
           "The value of seconds in minutes",
            JOptionPane.INFORMATION_MESSAGE);
        }
        // Determines if the seconds input is between  3600 to 86400 secs
        else if(3600.0 <= seconds && seconds < 86400.0)
        {
            hours = seconds / 3600.0;
            JOptionPane.showMessageDialog
           (null, "The amount of seconds inserted is equal to "
           + String.format("%.2f", hours) + " hours",
           "The value of seconds in hours",
            JOptionPane.INFORMATION_MESSAGE);
        }
        // Determines if the seconds input is over 86400 secs
        else if(seconds >= 86400.0)
        {
            days = seconds / 86400.0;
            JOptionPane.showMessageDialog
           (null, "The amount of seconds inserted is equal to "
           + String.format("%.2f", days) + " days.",
           "The value of seconds in days",
            JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}