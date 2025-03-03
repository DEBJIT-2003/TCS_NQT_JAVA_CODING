/*You are given an integer H, soverue the diglot of given number M, ensuring that the reverse number no leading zero
 * input:-200
 * output:-2
 * input:-122
 * output:-221
 * 
*/
public class Leading {
    public static int Num(int n) {
        boolean isNegative = (n < 0); 
        n = Math.abs(n); 

        int rev = 0;
        boolean leadingZeroSkipped = false;

        while (n > 0) {          //200>0
            int rem = n % 10;     //0
            n /= 10;              //   20
            
            // Skip leading zeros
            if (rem == 0 && !leadingZeroSkipped) {         //rem=0 && not false
                continue;
            }

            leadingZeroSkipped = true; 
            rev = rev * 10 + rem; 
        }

        return isNegative ? -rev : rev; 
    }

    public static void main(String[] args) {
        System.out.println(Num(-200)); 
        System.out.println(Num(-122)); 
        System.out.println(Num(10500)); 
        System.out.println(Num(0)); 
    }
}
