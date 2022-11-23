import java.util.Stack;

public class Validparenthesesi {

public boolean Validparentheses(String string)
{
Stack <Character> stack=new stack<Character>(); 
char[] chars=string.toCharArray();
for(char c:chars)
{
if(c=='('|| c=='{'||c=='[')
{
    stack.push(c);
}
else{
if(stack.isEmpty())
{
     return false;
}
else{
    char top=stack.peek();
if(c==')' && top=='(' || c==']' && top=='[' || c=='}' && top=='{')
{
    stack.pop();
}
else{
    return false;
}
}
}
}
}
public static void main(String[] args)
{
Validparenthesesi validpar=new Validparenthesesi();
Boolean valid=validpar.Validparentheses("{{{()}}}");
if (Boolean)
{
    Sytem.out.println("valid");

}
else{
    Sytem.out.println("not valid");
}


}


    
}
