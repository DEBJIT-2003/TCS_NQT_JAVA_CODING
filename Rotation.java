/*Q. A Program to check if strings are rotations of each
other or not?
Approach
1. Create a temp string and store concatenation of str1 to str1 in temp.
temp = str1.str1
2. If str2 is a substring of temp then str1 and str2 are rotations of each other.
Example:
str1 = "ABACD"
str2 = "CDABA"

Strings are rotations of each other
 */

import java.util.Scanner;

public class Rotation {
    public  static boolean IsRotation(String s,String t)
    {
        return ((s.length()==t.length() && ((s+s).indexOf(t)!=-1)));
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner((System.in));
    String a=sc.nextLine();
    String b=sc.nextLine();
    if(IsRotation(a, b))
      System.out.println("Strings are rotations of each other");
    
    else
      System.out.println("Strings are not rotations of each other");
    
    }
}
