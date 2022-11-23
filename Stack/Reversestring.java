import java.util.Stack;

public class Reversestring{

    public void reversestring(String string)
    {
     char chars[]=string.toCharArray();
     Stack <Character> stackr = new Stack<Character>();
     for (int i=0;i<string.length();i++)
     {
         stackr.push(chars[i]);
     }
     for (int i=0;i<string.length();i++)
     {
       chars[i]=stackr.pop();

     }
     String rev =new String(chars);
     System.out.println(rev);
    }

public static void main(String[] args)
{  
    Reversestring reverse=new Reversestring();
    reverse.reversestring("asssh");
}
}