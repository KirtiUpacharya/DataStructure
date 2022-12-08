import java.util.*;
public class Firstunique{

public void nonrepeating(String str)
{    
    Map<Character,Integer> map=new HashMap<>();
    char[] c=str.toCharArray();
    for(char ch:c)
    {
       map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(char ch:c)
    {
    if(map.get(ch)==1)
    System.out.println("Found");
    //return c[i];

    }
    //return -1;
}
public static void main(String[] args)
{
    Firstunique ff=new Firstunique();
     ff.nonrepeating("KIRTI");


}

}