public class queue{

private Listnode front;
private Listnode rear;
private int Length;

private class Listnode{

Listnode next;
int data;

public Listnode(int data)
{
    this.data=data;
    next=null;
}
}
public queue()
{

this.front=null;
this.rear=null;
this.Length=0;

}
public int dequeue()
{
int result=front.data;
front=front.next;

Length--;
return result;
}
public void enqueuedata(int data)
{
Listnode Temp=new Listnode(data);
if(isEmpty())
{
  front=Temp;  
}
else
{
rear.next=Temp;
}
rear=Temp;
Length++;
}
public boolean isEmpty()
{

return Length==0;
}
public void Display()
{
    Listnode Temp=front;
    while(Temp!=null)
    {   
        System.out.println("->" + Temp.data);
        Temp=Temp.next;
    }
    System.out.println("" + Length);
}
public static void main(String[] args)
{

queue queuee=new queue();
queuee.enqueuedata(10);
queuee.enqueuedata(20);
queuee.enqueuedata(30);
queuee.Display();
int result =queuee.dequeue();
System.out.println("dequed->" + result);
queuee.Display();
}



}