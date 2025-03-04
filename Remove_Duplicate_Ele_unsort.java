/*Problem Statement: Given an unsorted array, remove duplicates from the array.

Examples:

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements */

import java.util.Scanner;

public class Remove_Duplicate_Ele_unsort {
    public static void Duplicate(int a[],int n)
    {
      //  if (n == 0) return 0;
      int f=0; 
      int c=0;
      for(int i=0;i<n;i++)
      {
        f=0;
        for(int j=0;j<c;j++)
        {
            if(a[i]==a[j])
            {
              f=1;
              break;
            }
        }
        if(f==0)
       {
          a[c++]=a[i];
       }
      }
        for(int i=0;i<c;i++)
        {
            System.out.print(a[i]);
        }
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       
       Duplicate(a, n);
    }
}
