/*Q.7 Find the largest and smallest elements in an array.

Input: arr = {2,3,6, 7, 8,9 }

Output: Largest Element: 9

Smallest Element: 2 */
import java.util.Scanner;

public class MaxMin_element {
    public static void MaxMin(int a[],int n)
    {
        int max,min;
        max=min=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            else if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Maximum Number is :"+max + " Minimum Number is : "+min);
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
    MaxMin(a, n);
}
}
