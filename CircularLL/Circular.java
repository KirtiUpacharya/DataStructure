public class Circular{

    private Listnode Last=null;
    private class Listnode
{
     int data;
     Listnode next;

     public Listnode(int data)
     {
      this.data=data;
      next=null;
    
     }
}
public void Display()
{
Listnode current=Last.next;
while(current!=Last)
{
System.out.print(current.data + "->");
current=current.next;

}

}
public void addfirst(int data)
    {
        Listnode cur=new Listnode(data);
        cur.next=Last.next;
        Last.next=cur;
        

    }
public removefirstnode()
{/*
    check whther the list is empty or not
    if(isEmpty())
    {
        throw new NosuchElementException();

    }
    Listnode first=Last.next;
    Listnode second=first.next;
    last.next=second;
    first.next=null;*/
    // consider the logic where only single node is there in cc LL.
    //first=last.next;
    //if (Last.next=Last)
    /*{
       last=null;
       else{
           
           last.next=first.next;
           first.next=null;
       }
       return first;
    */}
}

public static void main(String[] args)
{
Circular CLL=new Circular();

Listnode first=CLL.new Listnode(10);
Listnode Second=CLL.new Listnode(20);
Listnode Third=CLL.new Listnode(30);
Listnode fourth=CLL.new Listnode(60);

first.next=Second;
Second.next=Third;
Third.next=fourth;
fourth.next=first;

CLL.Last=fourth;

CLL.Display();
CLL.addfirst(1);
CLL.Display();

}
 


}