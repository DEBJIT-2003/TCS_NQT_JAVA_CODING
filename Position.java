/*Question:

Consider the following series: 1, 1, 2, 3, 4, 7, 8, 15, 9, 24, 16, 40, 32, 72, 104, 27

This series is a mixture of 3 series -

All the prime position values are power of 2.

• All the perfect square position are power of 3.

• Remaining positions are sum of previous 2 values.

For example, if N=15, the 15th term in the series is 104, so only value 104 should be printed to STDOUT.

You can assume that N will not exceed 40. */
public class Position {

    public static boolean Prime(int n)
    {
        int i;
        if(n==1)
        return false;
        else
        for(i=2;i<n;i++)
        {
            if((n%i)==0)
            {
                break;
            }
        }
        if(n==i)
        return true;
        else
        return false;
    }
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; // Negative numbers cannot be perfect squares
        }
        int sqrt = (int) Math.sqrt(num);
        if(sqrt * sqrt == num)
        return true;
        else 
        return false;
    }
    public static int Pos(int n)
    {
        int poweroftwo=1;
        int powerofthree=1;
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(Prime(i+1))
            {
                a[i]=poweroftwo;
                poweroftwo*=2;
            }
            else if(isPerfectSquare(i+1))
            {
                a[i]=powerofthree;
                powerofthree*=3;
            }
            else
              a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(Pos(n));
    }
}