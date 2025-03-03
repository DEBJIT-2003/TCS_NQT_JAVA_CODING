import java.util.Scanner;

public class DateC {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
         String date=sc.nextLine();

         String parts[]=date.split("-");
         int m=Integer.parseInt(parts[1]);
         System.out.println("Date is :"+a[m-1]);
}
}
