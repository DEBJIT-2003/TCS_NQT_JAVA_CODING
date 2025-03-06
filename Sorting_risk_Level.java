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
