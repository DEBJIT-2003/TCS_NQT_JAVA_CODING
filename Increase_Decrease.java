
//import java.util.Arrays;
import java.util.*;

/*Q.10 Rearrange array in increasing-decreasing order.


Input: 871659

Output: 156987 */
public class Increase_Decrease {
    public static void Sort(int a[],int n)
    {
        Arrays.sort(a);
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a[i]);
        }
        for(int i=n-1;i>=n/2;i--)
        {
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
    Sort(a, n);
    }
}
