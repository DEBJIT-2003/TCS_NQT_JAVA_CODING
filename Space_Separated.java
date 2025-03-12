/*nput: Any integer positive number

Output: Print digits of the input number in same order in space separated fashion.

Public Test Case:

Input: 3452897

Output: 3 4 5 2 8 9 7 */
import java.util.Scanner;

public class Space_Separated {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
