/*Q. Can you write a regular expression to check if
String is a number? */

import java.util.Scanner;

public class Regular_Expression_number {
    public static void main(String[] args) {
         Scanner sc=new Scanner((System.in));
    String a=sc.nextLine();
    int f=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch>='0' && ch<='9' )
            {
                f=0;
            }
            else
              f=1;
              break;
        }
        if(f==0)
        {
           System.out.println ("This is all about number ");
        }
        else
         {
            System.out.println ("This is not all about number ");
         }
          
    }
}
