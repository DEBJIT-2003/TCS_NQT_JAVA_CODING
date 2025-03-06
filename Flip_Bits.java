
import java.util.Scanner;

/*55.The complement of an integer is the integer you get when you flip all the 0's to 1's and all 
the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.
Example 1:
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010.
 So you need to output 2.
Example 2:
Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. 
So you need to output 0
 */
public class Flip_Bits {
    public static int Decimal(String binary)
    {
        int sum=0,power=0;
        for(int i=binary.length()-1;i>=0;i--)
        {
            int bit=binary.charAt(i)-'0';
            sum=sum+bit*(int)Math.pow(2, power++);
        }
        return  sum;
    }
    public static int Binary(int n)     //5
    {
        int d=0,sum=0;
        while(n>0)         //5>0
        {
            int rem=n%2;      //1 |0 |1
            sum =sum+rem*(int)Math.pow(10, d++);   //0+1*10^0=1
                                                    //1+0*10^1=0
                                                    //1+1*10^2=101
            n=n/2;                                 //2,1
        }
          return  sum;
    }
    public static int Convert(int n)
    {
        String s=Integer.toString(Binary(n));   
        System.out.println("Binary Representation is:"+s);
        StringBuilder flipped=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                flipped.append('0');
            }
            else if(ch=='0')
            {
                flipped.append('1');
            }
        }
        System.out.println("After Toggle:"+flipped);
        int y=Decimal(flipped.toString());
        return  y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Convert(n));
    }
}
