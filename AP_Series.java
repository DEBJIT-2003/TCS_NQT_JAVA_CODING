/*Q.8 Given an A.P. Series, we need to find the sum of the Series..

Input:

n=4

a=2

d=2

Output: 20 */

import java.util.Scanner;

public class AP_Series {
    public static void main(String args[])
    {
          Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int a=sc.nextInt();
            int d=sc.nextInt();
            double sum=0;
            sum=(n*(2*a+(n-1)*d)/2);
            System.out.println("Sum of Ap series is :"+sum);
    }
}
