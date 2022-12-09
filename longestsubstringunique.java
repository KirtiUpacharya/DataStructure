
import java.util.*;

public class longestsubstringunique{


public int longest(string s)
{
    int maxlength=0;
Map<Character,Integer> map=new HashMap<Character,Integer>();
int start=0;
for(int end=0;end<s.length-1;end++)
{
char s1=s.charAt(end);


if(map.containsKey(s1))
{

start=Math.max(start,map.get(s1)+1);

}
map.put(s1,end);
maxlength=Math.max(maxlength,end-start+1);
}
System.out.println(maxlength);
return maxlength;

}

public static void main(String[] args)
{

    longestsubstringunique s= new longestsubstringunique();
    s.longest("KIRTI");


}




}