import java.util.Scanner;

public class Prime_Squreroot {
    public static double prime(int n)
    {
        double h=0.0;
        int i=0;
        if(n==0 && n==1)
        {
            System.out.println("Number is Not Prime");
        }
        for( i=2;i<n;i++)
        {
            if((n%i)==0)
            {
                break;
            }
        }
        if(n==i)
        {
            System.out.println("This is prime Number");
             h=Math.sqrt(i);
        }
        return h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("Square root: %.2f%n", prime(n));

    }
}
