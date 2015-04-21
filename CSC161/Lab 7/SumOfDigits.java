import java.util.*;

class SumOfDigits {
        public static void main(String args[]) {
                int sum = 0;
                System.out.println("Enter multi digit number:");
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                int t = n;
                while (n > 0) {
                        int p = n % 10;
                        sum = sum + p;
                        n = n / 10;
                }
                System.out.println("sum of the digits in " + t + " is " + sum);
        }
}