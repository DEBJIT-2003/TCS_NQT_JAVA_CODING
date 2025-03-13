/*Jack and Jill are playing string game, Jack has given Jill two strings A and B.

Jill has to derive a string C from A,by deleting elements from string A, such that string C does not contain any element of string B.

Jill needs help to do this task. She wants a program to do this as she is lazy.

Given strings A and B as input, give string C as Output.

Example 1:

Input:

tiger input string A

ti -input string B

Output:

ger -> Output string C

Explanation:

After removing "t" and "i" from "tiger", we are left with "ger".

So, the answer is "ger".

Example 2:

PLACEMENT

processed input string A

esd

Output:

> input string

BELO

proc -Output string C

Explanation:

After removing "e" "s" and "d" from "processed", we a left with "proc".

So, the answer is "proc". */
import java.util.Scanner;
public class Tcs_1 {

        public static String removeCharacters(String A, String B) {
            StringBuilder result = new StringBuilder();
            for (char ch : A.toCharArray()) {
                if (B.indexOf(ch) == -1) { // If character is not in B
                    result.append(ch);
                }
            }
            return result.toString();
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String A = scanner.next();
            String B = scanner.next();
            scanner.close();
            
            System.out.println(removeCharacters(A, B));
        }
    }
