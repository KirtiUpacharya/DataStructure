import java.util.Set;

public class HappyNo{


public boolean happyno(int n)
{
   Set<Integer> myset;
   int index=0;

   while(1)
   {
       int val=0;
        while(n)
        {
            index=n%10;
            val =(index*index)+val;

             n/=10;
        }

        if(val==1)
        {return true;}
        else if(myset.contains(val))
        {
            return false;
        }
        else{

        myset.add(val);
        n=val;
        }
      return false;  

   }

return false;

}
public static void main(String[] args)
{
 HappyNo h=new HappyNo();
 h.happyno(34);



}



}