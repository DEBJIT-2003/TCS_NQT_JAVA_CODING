
import java.util.Scanner;

/*56.	Equilibrim Point
 Input:- -7 1 5 2 -4 3 0
Output:- 3
 */
public class Equilibriam {
     public static int Equilibrim_point(int a[],int n)
     {
        int totalsum=0;
        int leftsum=0;
        for(int i=0;i<n;i++)
       { 
          totalsum=totalsum+a[i];      // 0 
       }  
       for(int i=0;i<n;i++) 
       {
        totalsum=totalsum-a[i];       //(0-(-7))=7 |7-1=6 |6-5=1|1-2=-1
        if(leftsum==totalsum)         
        {
            return  i;                //i=3
        }
       leftsum=leftsum+a[i];         //(0-7)=-7 |-7+1=-6 |-6+5=-1
       }
       return -1;
     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
    System.out.println(Equilibrim_point(a, n));
    }
}