/*Q.4 Count frequency of each element in the array.

Input: arr[] = {10,5,10,15,10,5);

Output: 10 -->3

5--->2

15--->1 */

import java.util.Scanner;

public class Frequency_Number {
    public static void Bubble_sort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void Frequemcy(int a[],int n)
    {
        Bubble_sort(a, n);
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(i<n-1 && a[i]==a[i+1])
            {
                c++;
            }
            else{
                System.out.println("Frequency of Number " +a[i] + "---->" + c);
                c=1;
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
           Frequemcy(a, n);
    }
}
