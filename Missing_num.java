/*Q. Find the missing number in an array?
Approach
1. Calculate A = n (n+1)/2 where n is largest number in series 1…N.
2. Calculate B = Sum of all numbers in given series
3. Missing number = A – B
 */
import java.util.Scanner;

public class Missing_num {
    public static int Miss(int a[],int n)
    {
        int diff=0;
       int actual_number=0;

       int expected_sum=(n+1)*(n+2)/2;

       for(int i=0;i<n;i++)
       {
        actual_number+=a[i];
       }
       diff=expected_sum-actual_number;
       return diff;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }

    System.out.println(Miss(a, n));
}
}
