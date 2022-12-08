import java.util.Set;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class removevowels
{

public String removevowelss(String str)
{ 

 Set<Character> vowels=new HashSet<>();
 vowels.add('a');
 vowels.add('e');
 vowels.add('i');
 vowels.add('o');
 vowels.add('u');
 char[] chars=str.toCharArray();
 StringBuilder sb=new StringBuilder();
 for(char c:chars)
 {
      if(!vowels.contains(c))
      {
         sb.append(c);
      }

 }
 String s=sb.toString();
 //System.out.println(sb.toString);
 return s;
}
public static void main(String[] args)
{
    removevowels r=new removevowels();
    String s=r.removevowelss("What do u like,KIRTI");
    System.out.println(s);
}



}