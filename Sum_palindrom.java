import java.util.Scanner;

public class Sum_palindrom {
    public static void Palindrom(int n)
    {
        int sum=0,rev=0;

        while(n>0)
        {
          int rem=n%10;
          sum=sum+rem;
          n=n/10;
        }
        int x=sum;
        while(sum>0)
        {
           int  rem=sum%10;
            rev=rev*10+rem;
            sum=sum/10;
        }
        if(x==rev)
        {
            System.out.println("1");
        }
        else
           System.out.println("0");
    }
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palindrom(n); 

}
}