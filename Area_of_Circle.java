import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diameter = sc.nextInt();
        double r = diameter / 2.0;  // Use 2.0 to ensure floating-point division
        double area = 3.14 * r * r;
        System.out.printf("Area is: %.2f", area);  // Print with 2 decimal places
        sc.close();
    }
}
