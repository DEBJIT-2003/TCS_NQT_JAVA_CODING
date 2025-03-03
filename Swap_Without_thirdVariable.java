/*Q.6 Swap Two Numbers Without Using a Third Variable.

Input: a = 5 b = 10

Output: a = 10 b = 5

*/

import java.util.Scanner;

class Swap_Without_thirdVariable
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before Swapping a="+a + " b="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping a="+a + " b="+b);

    }
}