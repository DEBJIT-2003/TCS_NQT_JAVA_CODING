/*Armstrong Number :
n=153
output=YES
n=369
Output=NO
 */
import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=n;
        int sum=0;
        int d=0;
        while(n>0)
        {
            int rem=n%10;
            d++;
            n=n/10;
        }
        n=x;
        while(n>0)
        {
            int rem=n%10;
             sum=sum+(int)Math.pow(rem,d);
             n=n/10;
        }
        if(x==sum)
        {
            System.out.println("Yes");
        }
        else
           System.out.println("No");

    }
}