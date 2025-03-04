/*Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5 */

import java.util.*;

public class Find_Median {
    public static double Median(int a[], int n) {
        Arrays.sort(a); // Sorting the array first
        if (n % 2 == 0) {
            return (a[(n / 2) - 1] + a[n / 2]) / 2.0; 
        } else {
            return a[n / 2]; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Median(a, n));
    }
}
