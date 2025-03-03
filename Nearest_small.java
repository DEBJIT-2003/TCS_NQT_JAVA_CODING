/*Question:

Given an array of integers, find the nearest smaller number for every element such that the smaller element is on the left side.

Input:

{1, 6, 4, 10, 2, 5)

Output: (-1, 1, 1, 4, 1, 2)

Input 2:

{3,2,1}

Output 2: (-1,-1,-1)
 */
import java.util.Scanner;

public class Nearest_small {
    public static void Pro(int a[],int n)
    {
        int b[]=new int[n];
       // int min=-1;
        for(int i=0;i<n;i++)
        {
            int min=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]<a[i])
                {
                    min=a[j];
                    break;
                }
            }
            b[i]=min;
        }
         for(int i=0;i<n;i++)
         {
            System.out.print(b[i]);
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
    Pro(a, n);
    }
}
