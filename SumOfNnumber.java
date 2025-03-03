/*Q.1 Given a number 'N', find out the sum of the first N natural numbers.

Input: N=5

Output: 15


Explanation: 1+2+3+4+5=15 
*/


import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int sum=0;
          for(int i=1;i<=a;i++)
          {
            sum=sum+i;
          }
            System.out.println("Sum is :"+sum);
    }
}
