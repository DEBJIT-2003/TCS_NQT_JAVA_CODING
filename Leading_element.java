/*Q. How to find all the leaders in an integer array in
java?
An element is leader if it is greater than all the elements to its right side. And the
rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2},
leaders are 17, 5 and 2.
 */

import java.util.Scanner;

public class Leading_element {
    public static void Lead(int a[],int n)
    {
        int max=a[n-1];
        System.out.print(" " +max);
        for(int i=n-2;i>=0;i--)
        {
            if(max<a[i])
            {
                max=a[i];
                System.out.print(" " +max);
            }
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
         Lead(a, n);
    }
}
