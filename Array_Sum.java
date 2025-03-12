/* TCS Coding Questionience of pair with given surat array

Example:

Sum=10,-

No. of array elements=9

Array elements are 0 2574 6 10 20-10

Result: Array has two elements with given sum */
import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of elements
        int num = sc.nextInt();  // Target sum
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  // Sorting the array
        int l = 0, r = n - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == num) {
                System.out.println("Array has two elements with given sum");
                return;  // Exit once a valid pair is found
            } else if (sum < num) {
                l++;  // Increase left pointer
            } else {
                r--;  // Decrease right pointer
            }
        }

        System.out.println("No such pair found");
    }
}
