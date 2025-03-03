/*All possible prime numbers within the range

Input: Two +ve integers separated by space denoting start and end of

range

Output: list of all possible prime numbers within the range separated by space
nput: 1 10

Output: 17
 */ 
import java.util.Scanner;

public class Prime_Sum {
     public static void prime(int l,int n)
    {
        int fg=0,sum=0;
       for(int i=Math.max(l,2);i<=n;i++)
       {
         fg=0;
         for(int j=2;j<i;j++)
         {
            if(i%j==0)
            {
                fg=1;
                break;
            }
         }
         if(fg==0)
         {
            sum=sum+i;
         }
       }
       System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        prime(l,n);
}
}
