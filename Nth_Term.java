


/*Given an array arr of size n, swap the k"" element from the beginning
with kth ele
"element from the end.
Example 1:
Input:
n = 8
k= 3
arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output: {1, 2, 6. 4, 5, 3, 7, 8}
Explanation:
" element from beginning is 3 and from end is 6. */
import java.util.*;
public class Nth_Term {
    public static void Find(int arr[],int n,int k)
    {
        if(k>0 && k<=n)
        {
            int temp=arr[k-1];
            arr[k-1]=arr[n-k];
            arr[n-k]=temp;
        }
        System.out.println(Arrays.toString(arr));
     }
        public static void main(String[] args) {
            int n=8;
            int arr[]={1,2,3,4,5,6,7,8};
            int k=3;
            System.out.println(Arrays.toString(arr));
            Find(arr, n, k);
        }
    }

