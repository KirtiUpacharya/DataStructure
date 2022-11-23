//Impleementation of stack

public class StackLL{

    public Listnode Top=null;
    private int count=0;
    private class Listnode{
    int data;
    Listnode next;
    
   public Listnode(int data)
   {
    this.data=data;
    next=null;
    }
}
public void push(int data)

{

Listnode Temp=new Listnode(data);
Temp.next=Top;
Top=Temp;
count++;
System.out.println("Size is->" + count );
//return count;
}

public void pop()
{ 
  Listnode Temp1=Top.next;
  Top.next=null;
  Top=Temp1;
  count--;
  System.out.println("Size is ->" + count);
  //return count;
}
public void printstack()
{
 for(int i=0;i<count;i++)
 {

 System.out.println(Top.data);
 Top=Top.next;
 
 }

}
public void peek()
{
  System.out.print(Top.data);
}

public static void main(String[] args)
{
 StackLL stackll=new StackLL();
 stackll.Top=null;
 stackll.push(10);
 System.out.println(stackll.Top.data);
 stackll.push(20);
 stackll.push(30);
 stackll.push(40);
 stackll.printstack();
 //stackll.pop();
 

}
}