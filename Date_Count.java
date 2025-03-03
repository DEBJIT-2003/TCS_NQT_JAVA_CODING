/*
 Q10: User enters date in dd-mm-yyyy find out number of days in month (for now please ignore the concept of leap year)


Input: Date in dd-mm-yyyy format

Output: number of days in the date entered by user

Public Test Case:

Input: 12-03-2006

Output: 31

Input: 31-11-1996

Output: 30
 */
import java.util.Scanner;

public class Date_Count {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();

         String parts[]=date.split("-");
         int m=Integer.parseInt(parts[1]);
         System.out.println("Days are : "+DateCount(m));
    }
    public static int DateCount(int m)
    {
        if(m==0 || m>12)
        {
            return  0;
        }
       if(m==1 || m==3 || m==5 || m==7  || m==8 || m==10 || m==12)   // jan,mar,may,july,aug,oct,dec
       {
           return 31;
       }
       else if(m==4 || m==6 || m==9 || m==11 )
       {
        return 30;
       }
       else if(m==2)
       {
        return 28;
       }
       else
        return -1;

     }
}
