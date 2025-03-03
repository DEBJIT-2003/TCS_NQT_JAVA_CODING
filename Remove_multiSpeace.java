import java.util.Scanner;

public class Remove_multiSpeace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        boolean spaceFound = false;
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (currentChar == ' ') {
                if (spaceFound) {
                    sb.deleteCharAt(i);
                    i--;
                } else {
                    spaceFound = true;
                }
            } 
            else {
                spaceFound = false;
            }
        }

        System.out.println("Output: " + sb.toString().trim());
    }
}
