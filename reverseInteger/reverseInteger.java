import java.util.*;

public class reverseInteger{

public long reversenumber(int number)
{
  long reverse=0;
  boolean isNeagtive=number<0;

  if(isNeagtive)
  {
      number=number* -1;
    
  }
  while(number>0)
  {
      int Lastdigit=number%10;
      reverse=reverse*10+Lastdigit;
      number=number/10;

  }
return isNeagtive?reverse*-1:reverse;

}
public static void main(String[] args)
{
 
    reverseInteger r=new reverseInteger();
    long a=r.reversenumber(1123456);
    System.out.println(a);
}


}