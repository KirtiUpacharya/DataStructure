import java.util.LinkedList;
import java.util.*;

public class ImpleStackUQ{

    private Queue<Integer> q1=new LinkedList<Integer>();
    private Queue<Integer> q2=new LinkedList<Integer>();//source

    int size=0;

    public void push(int data)
    {
        q2.add(data);
        size++;
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
       Queue<Integer> Temp=q1;
       q1=q2;
       q2=Temp;
       System.out.println(size); 
    }

    public int pop()
    {
        /*if(q1.isEmpty())
        {
           throw new Exception ("Stack is Empty");

        }
        try{
          if(q1.isEmpty())
          System.out.println("Stack is Empty");
        }catch(Exception e){
          
        }*/
   size--;
   System.out.println(size); 
   return q1.remove();
    }
  public static void main(String[] args)
  {
    ImpleStackUQ ss=new ImpleStackUQ();
    ss.push(10);
    ss.push(20);
    ss.push(30);
    ss.pop();


  }

}