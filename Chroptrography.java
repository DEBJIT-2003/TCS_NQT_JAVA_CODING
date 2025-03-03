/*Enter the string:
AdfTu34
Enter the key:
1
Encrypted String: BegUv45

Enter the string:
yZ89
Enter the key:
2
Encrypted String: aB01

*/
import java.util.Scanner;

class Chroptrography
{
    public static String Crep(String s,int key)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
                if(ch>='A' && ch<='Z')
                {
                   char c=(char) ('A' + (ch - 'A' + key) % 26);
                   s1=s1+c;
                }
              else if((ch>='a' && ch<='z'))
              {
                char c=(char) ('a' + (ch - 'a' + key) % 26);
                s1=s1+c;
              }
                else if(ch>='0' && ch<='9')
                {
                    int n=ch-'0';
                    s1=s1+((n+key)%10);
                }
            }
            return s1;
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int key=sc.nextInt();
        System.out.println(Crep(s, key));
        }
    }
