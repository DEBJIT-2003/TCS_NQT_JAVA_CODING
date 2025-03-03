/*Question 2: Count Vowels and Consonants

Problem Statement:

Write a program to count the number of vowels and consonants in a given string.

Input:

A single line containing the string.

Output:

Two integers representing the count of vowels and consonants respectively.

Sample Input:

Hello World

Sample Output:

37 */
import java.util.Scanner;

public class Vowl_Con_Count {
    public  static  void check(String s)
    {
        int v=0,c=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if (ch >= 'a' && ch <= 'z'){
           if(ch=='a' ||ch=='e' || ch=='i'|| ch=='o' || ch=='u' )
           {
              v++;
           }
           else {
              c++;
        }
    }
    }
        System.out.println(v + " " + c);
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        check(s);
      }
}
