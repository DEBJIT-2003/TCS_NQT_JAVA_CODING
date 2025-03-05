/*Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific
 position.

Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 */

import java.util.*;

public class ArrayInsertion {
    
    public static int[] insertBeginning(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static int[] insertEnding(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        return newArr;
    }

    public static int[] insertAtPos(int[] arr, int value, int pos) {
        if (pos < 1 || pos > arr.length + 1) {
           // throw new IllegalArgumentException("Invalid position");
           System.out.println("Invalid");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos - 1) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Choose operation:");
        System.out.println("1: Insert at Beginning");
        System.out.println("2: Insert at End");
        System.out.println("3: Insert at Specific Position");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter value to insert at beginning: ");
                int val1 = sc.nextInt();
                array = insertBeginning(array, val1);
                break;
            case 2:
                System.out.print("Enter value to insert at end: ");
                int val2 = sc.nextInt();
                array = insertEnding(array, val2);
                break;
            case 3:
                System.out.print("Enter value to insert: ");
                int val3 = sc.nextInt();
                System.out.print("Enter position to insert at (1-based index): ");
                int pos = sc.nextInt();
                array = insertAtPos(array, val3, pos);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Updated Array: " + Arrays.toString(array));
        sc.close();
    }
}
