/* Allon Finezilber
   CSC-162
   Lab 1E */

import javax.swing.JOptionPane;

public class RecursiveMultiplier
{
   public static void main(String args[])
   {
	  double x, y;
	  String strX, strY;

	  strX = JOptionPane.showInputDialog("Please insert a number:");
      x = Double.parseDouble(strX);

      strY = JOptionPane.showInputDialog("Please insert the multiplier:");
      y = Double.parseDouble(strY);

      double product = getAnswer(x, y);

	  JOptionPane.showMessageDialog(null, String.format
        ("%.0f times %.0f is equal to: %.0f",x, y, product),
         "Calculator", JOptionPane.INFORMATION_MESSAGE);


	  System.exit(0);
   }

   public static double getAnswer(double x1, double y1)
   {
	   double calc = 0.0;

	   if(y1 == 0)
	   	  return calc;
	   else
	   {
		  calc = x1 + getAnswer(x1, (y1-1));
		  return calc;
	   }
   }


}