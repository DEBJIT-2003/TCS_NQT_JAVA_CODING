/*Write a program to find the longest word in a given sentence.

Input:

A single line containing the sentence.

Output:

The longest word in the sentence.

Sample Input:

I love programming and problem solving

Sample Output:

programming */

import java.util.Scanner;

public class Longest_word {
    public static String Long(String s)
    {
        String words[]=s.split(" ");
        int max=0;
        String l="";
        for(String word:words)
        {
            if(word.length()>max)
            {
                max=word.length();
                l=word;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Long(s));
    }
}
