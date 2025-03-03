
import java.util.Scanner;

/*Q. Write a program to find top two maximum
numbers in an array? */


public class Maximum_two {
    public static void bubble(int a[],int n)
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
    public static void Max_two(int a[],int n)
    {
        bubble(a, n);
        int max=a[n-1],secmax=a[0];
        for(int i=n-1;i>=0;i--)
        {
            if(max>a[i])
            {
               secmax=a[i];
               break;
            }
        }
        System.out.println("Max two number is :"+max+ " " +secmax);
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         Max_two(a, n);
     }
}
