/*
 Q12: Program to find sum of digits.

Input: Any integer positive number

Output: Print sum of all its digits.

Public Test Case:

Input: 1234 Output: 10

4:43

Input: 129487

Output: 31
 */

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            while(n>0)
            {
              int rem=n%10;
              sum=sum+rem;
              n=n/10;
            }
            System.out.println("Sum of digit is : " +sum);
    }
}
