import java.util.Scanner;

public class GCD {
    public static int gcd_number(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        while(b>0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD is:"+gcd_number(a, b));
    }
}
