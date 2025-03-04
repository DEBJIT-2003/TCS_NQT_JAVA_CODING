/*Remove Duplicates in-place from Sorted Array

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique 
element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
 It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array. */

import java.util.Arrays;
import java.util.Scanner;


public class Remove_Duplicate_Ele_sort {
    public static int removeDuplicates(int a[], int n) {
        if (n == 0) return 0;
        
        Arrays.sort(a); 
        int index = 1; 
        
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) { 
                a[index++] = a[i];
            }
        }
        
        return index; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       

        int newSize = removeDuplicates(a, n);
        System.out.println("After removing duplicates:");
        
        for (int i = 0; i < newSize; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
