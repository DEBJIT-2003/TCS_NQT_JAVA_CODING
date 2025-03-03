import java.util.Scanner;

public class Greatest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        // if(a>b && b>c)
        // {
        //     System.out.println(a);
        // }
        // else if(b>c && b>a)
        // {
        //     System.out.println(b); 
        // }
        // else
        //    System.out.println(c);
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}
