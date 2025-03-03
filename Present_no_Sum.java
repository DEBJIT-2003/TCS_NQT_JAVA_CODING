/*Question 1: Sum of Digits in a String

Problen Statement:

Given a string containing both alphabets and digits, write a program to find the sum of all digits present in the string.

Input:

A single line containing the string.

Output:

An integer representing the sum of all digits in the string.

Sample Input:

abc123xyz45

Sample Output:

15 */

import java.util.Scanner;

public class Present_no_Sum {
    public static int Sum(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                sum=sum+(ch-'0');
            }
        }
        return  sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Sum(s));
    }
}
