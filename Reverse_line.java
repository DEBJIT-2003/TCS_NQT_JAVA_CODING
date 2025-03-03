import java.util.Scanner;

public class Reverse_line {
    public static void main(String args[])
    {
        Scanner sc=new Scanner((System.in));
        String s=sc.nextLine();
        String b="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            b=b+ch;
        }
        System.out.println(b);
    }
}
