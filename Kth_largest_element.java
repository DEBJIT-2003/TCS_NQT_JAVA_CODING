import java.util.*;
public class Kth_largest_element{
    public static void Ele(int a[],int n,int k )
    {
        int c=0;
        Arrays.sort(a);   //sorting
        for(int i=n-1;i>=0;i--)
        {
            c++;
            if(c==k)
            {
                System.out.println(a[i]);
                break;
            }
        }
      //  return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 
        int k = sc.nextInt();  //
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Ele(arr, n, k);
    }
}