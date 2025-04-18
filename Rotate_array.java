/*Rotate array by K elements : Block Swap Algorithm
In this article we will learn a very popular algorithm for "Rotate array by K elements : Block Swap Algorithm".

Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements. */

import java.util.Scanner;

public class Rotate_array {
    public static void Rotate(int a[],int n,int k)
    {
        for(int i=k;i<n;i++)
        {
            System.out.print(a[i]);
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]);
        }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
    int k=sc.nextInt();
    Rotate(a, n, k);
}
}
