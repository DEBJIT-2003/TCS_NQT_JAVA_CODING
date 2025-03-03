/**
* Java program to swap two strings without using a temporary
* variable.
**/
import java.util.*;
public class Swap {
    public static void main(String[] args) {
    Scanner sc=new Scanner((System.in));
    String a=sc.nextLine();
    String b=sc.nextLine();

    System.out.println("Before Swaping : a: "+a + " b: " +b);

    a=a+b;
    b=a.substring(0,a.length()-b.length());
    a=a.substring(b.length());

    System.out.println("After Swaping : a: "+a + "b: " +b);


    }
}
