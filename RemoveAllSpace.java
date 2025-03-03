public class RemoveAllSpace {
   
        public static String RemoveSpace(String s)
        {
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch!=' ')
                {
                    s1.append(ch);
                }
            }
           
            return s1.toString();
        }
        public static void main(String[] args) {
        String s="   Debjit roy    ";
        String output=RemoveSpace(s);
        System.out.println("After RemoveAll Spaces:"+output);
    }
 }

