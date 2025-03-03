import java.util.Scanner;

public class Palindrom_String {
        public static String PalString(String s)
        {
          
           String rev="";
             for(int i=s.length()-1;i>=0;i--)
             {
                 char ch=s.charAt(i);
                 rev=rev+ch;
             }
             if(s.equals(rev))
             {
                return "Yes";
             }
             else{
    
                return "No";
    
             }
        }
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(PalString(s));
    }
}
