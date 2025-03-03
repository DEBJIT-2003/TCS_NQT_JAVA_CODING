/*
 Q11: Program to find whether a number is perfect square or not.

Input: Any integer positive number

Output: Print Success if the input number is a perfect square and failure if the input number is not a perfect square

Public Test Case:

Input: 625

Output: Success

A

Input: 1002

Output: Failure

 */

import java.util.Scanner;

public class PerfectSquare {
    public static void Perfect(int n)
    {
        int x=n;
        int r=(int)Math.sqrt(n);      //625=25
        int s=(int)Math.pow(r,2);  //25*25=625
        if(x==s)
        {
            System.out.println("SUCCESS");
        }
        else
        {
            System.out.println("FAILURE");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         Perfect(n);
    }
}
