import java.util.Scanner;

public class Palindrom_Number {
    public static void Palindrom(int n)
    {
        int rev=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palindrom(n); 
        // System.out.println(Num(-122)); 
        // System.out.println(Num(10500)); 
        // System.out.println(Num(0)); 
    }
}
