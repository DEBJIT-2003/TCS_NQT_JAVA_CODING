/*A chocolate factory is packing chocolates into packets. The chocolate packets here represent an array of N number of integer values. 
The Task is to find the empty packets(0) of chocolate and push it to end of the conveyer belt.

Example 1:

N=8

arr[4,5,0,1,9,0,5,0]

Output 1:

45195000 */
import java.util.Scanner;
class Chocolate
{
    public static void Cho(int a[],int n)
    {
        int b[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                b[j++]=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0){
            b[j++]=a[i];
            }
        }
        for(int i=0;i<j;i++)
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
        Cho(a, n);
        }
    }