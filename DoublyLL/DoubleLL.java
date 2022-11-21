public class DoubleLL{ 

private Listnode Head;
private Listnode tail;
//private Listnode length;

private class Listnode {
private int data;
private Listnode Previous;
private Listnode next;

public Listnode(int data)
{ 
this.data=data;
Listnode Previous=null;
Listnode next=null;
}}

public DoubleLL()
{
    this.Head=null;
    this.tail=null;
}
public void addbeginning(int data)
{
Listnode addnode=new Listnode(data);
addnode.Previous=null;
Head.Previous=addnode;
addnode.next=Head;
Head=addnode;
}

public void addLast(int data)
{
    Listnode addlast=new Listnode(data);
    tail.next=addlast;
    addlast.Previous=tail;
    addlast.next=null;
    tail=addlast;

}
public void deletelastDLL()
{
Listnode cur= tail;
//Listnode newtail=
//tail.next=null;
tail=tail.Previous;
cur.Previous =null;


}

public void Displayforward()
{
 Listnode currentnode=Head;
 while(currentnode!=null)
 {
     System.out.print("->" + currentnode.data);
     currentnode=currentnode.next;
 }
System.out.println("");
}

public void Displayreverse()
{
 Listnode currentnode=tail;
 while(currentnode!=null)
 {
     System.out.print("->" + currentnode.data);
     currentnode=currentnode.Previous;
 }
  System.out.println("");
}
public void length()
{
int count=0;
Listnode Temp=Head;
while(Temp!=null)
{
count++;
Temp=Temp.next;
}
System.out.println("Count is ->" + count);
}

public static void main (String[] args)
{
DoubleLL LL=new DoubleLL();
LL.Head= LL.new Listnode(10);
Listnode second=LL.new Listnode(20);
Listnode third=LL.new Listnode(30);
LL.tail=LL.new Listnode(40);


LL.Head.next=second;
second.next=third;
third.next=LL.tail;
LL.tail.next=null;

LL.Head.Previous=null;
second.Previous=LL.Head;
third.Previous=second;
LL.tail.Previous=third;


LL.Displayforward();
LL.Displayreverse();
LL.length();
LL.addbeginning(90);
LL.Displayforward();
LL.Displayreverse();
LL.addLast(110);
LL.Displayreverse();
LL.Displayforward();
LL.deletelastDLL();
System.out.println("Here is deleted");
LL.Displayreverse();
LL.deletelastDLL();
LL.Displayforward();
LL.length();

}
    
}