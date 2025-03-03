
import java.util.Scanner;

/*Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note: Ist element of the array should be considered in the count of the result.

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will be considered in the result. 8 and 9 are also the elements that are greater than all of its
 previous elements. Since total of 3 elements is present in the array that meets the condition.

Hence the output = 3.

Example 1:

Input

5-> Value of N, represents size of Arr

7-> Value of Arr[0]

4-> Value of Arr[1]

8-> Value of Arr[2]

2-> Value of Arr[3]

9-> Value of Arr[4]

Output: 3 */
class Greater_Element{
    public static int Greater(int a[],int n)
    {
        int c=1;
        int max=a[0];
        for(int i=1;i<n;i++)
        {
           if(a[i]>max)
           {
             c++;
             max=a[i];
           }
        }
        return c;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("OUTPUT = "+Greater(a, n));
    }
}