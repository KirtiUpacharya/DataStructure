import java.util.LinkedList;
import java.util.Queue;


public class GenerateBinaryNumber{
    
public String[] Generatebinarynumbers(int n)
{
Queue<String> queuee = new LinkedList<>();
String[] result=new String[n];

queuee.offer("1");
for(int i=0;i<n;i++)
{
    result[i]=queuee.poll();
    
    String n1=result[i]+"0";
    String n2=result[i]+"1";
  queuee.offer(n1);
  queuee.offer(n2);
    
}
return result;
}
public static void main(String[] args)
{
    GenerateBinaryNumber GE=new GenerateBinaryNumber();
    String result[]=GE.Generatebinarynumbers(10);
    int length=result.length;
    for(int i=0;i<length;i++)
    {
        System.out.println(result[i]);
    }
    
}
}
