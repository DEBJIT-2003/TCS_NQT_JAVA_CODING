import java.util.Scanner;

public class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        sc.close();

        // Upper part including the middle row
        for (int i = 1; i <= N; i++) {
            printRow(i);
        }

        // Lower part (mirror image of upper without middle row)
        for (int i = N; i >= 1; i--) {
            printRow(i);
        }
    }

    static void printRow(int num) {
        for (int j = 0; j < num; j++) {
            System.out.print(num);
            if (j != num - 1) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
