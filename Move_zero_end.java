/*Q. Write a java program to Move all zeroes to end of
array?
Input: arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0}; */

import java.util.Scanner;

public class Move_zero_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int sum=0,j=0;
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
        if(a[i]!=0)
        {
            b[j++]=a[i];
        }
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
        {
            b[j++]=a[i];
        }  
    }
    for(int i=0;i<j;i++)
    {
        System.out.print(b[i]);
    }
}
}
