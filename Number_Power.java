
import java.util.Scanner;

public class Number_Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           sum=sum*n;
        }
        System.out.print(sum);
    }
}
