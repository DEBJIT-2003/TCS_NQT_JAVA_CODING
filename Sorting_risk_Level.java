/*Sorting Risk Levels at Airport Security

Airport security officials have confiscated various items at the security checkpoint. Each item is assigned a risk severity level, 
categorized into three levels:

0 Low risk

1- Medium risk

* 2-High risk

These confiscated items are placed in an unordered list. Your task is to sort the items based on their risk severity in ascending 
order, ensuring that low-risk items come first, followed by medium-risk items, and finally high-risk items.

Input Format:

The first line contains an integer N (1≤ N ≤ 10°), representing the number of confiscated items.

The next N lines each contain an integer (0, 1, or 2) representing the risk severity level of an item.

Output Format:

Print the sorted sequence of risk severity levels in a single line, separated by spaces.

Example 1

Input:

7 1 0 2 1

Output:

0112 */

import java.util.*;

public class Sorting_risk_Level {
    public static void Sort_risk(int a[], int n) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences of 0s, 1s, and 2s
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) count0++;
            else if (a[i] == 1) count1++;
            else count2++;
        }

        // Print sorted output
        for (int i = 0; i < count0; i++) System.out.print("0 ");
        for (int i = 0; i < count1; i++) System.out.print("1 ");
        for (int i = 0; i < count2; i++) System.out.print("2 ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Sort_risk(a, n);
    }
}
