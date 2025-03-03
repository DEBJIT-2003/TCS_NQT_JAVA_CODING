/*Q. Write a function to find out duplicate words in a given string? */


import java.util.*;
public class Duplicate_word {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0,i;
         s=s.toLowerCase();
        String words[]=s.split(" ");

        for( i=0;i<words.length;i++)
        {
            c=1;
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j])){
                c++;
                words[j]="0";
            }
        }
        if(c>1 && words[i]!="0")
        {
            System.out.println(words[i]);
        }
    }
}
}
