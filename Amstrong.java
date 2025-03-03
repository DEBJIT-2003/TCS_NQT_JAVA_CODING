
import java.util.Scanner;

public class Amstrong {
    public static void Arms(int n)
    {
        int x=n;
        int sum=0,rem=0,d=0;
        while(n>0)
    {
        rem=n%10;
        d++;
        n=n/10;
    }
    n=x;
    while(n>0)
    {
        rem=n%10;
        sum=sum+(int)Math.pow(rem,d);
        n=n/10;
    }
    if(x==sum)
    {
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Arms(n);
    }
}
