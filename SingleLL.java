public class SingleLL {
   private Listnode Head;
    public static class Listnode{

     private int data;
     private Listnode next;

     public  Listnode(int data)
    {
        this.data= data;
        this.next= null;
    } 
}
 
public void addpos(int data,int pos)
{ 
  Listnode newnode=new Listnode(data);
  Listnode Previous=Head;//curret till pos-1
  //Listnode Temp;
if(pos==1)
{
  newnode.next=Head;
  Head=newnode;
}
  
int count=1;
while(count < pos-1)
{
 Previous=Previous.next;
 count++;
}
//Listnode current=Previous.next;
 newnode.next=Previous.next;
 Previous.next=newnode;
}

public void Display(Listnode Head)
 {
 Listnode currentnode=Head;
 while(currentnode!=null)
 {
     System.out.print(currentnode.data + "->");
     currentnode=currentnode.next;  
}
 System.out.print("null");
 System.out.println();
}
public void addfirst(int data)
{
  Listnode firstnode= new Listnode(data);
  firstnode.next =Head;
  Head=firstnode;
}
public void addlast(int data)
{ Listnode currentnode=Head;
  Listnode NewNode=new Listnode(data);
  if(Head==null)
  Head=NewNode;
  while(currentnode.next!=null)
  {
    currentnode=currentnode.next;
  }
  currentnode.next=NewNode;
}
public int findlegnth() 
{
 int count=0;
 Listnode currentnode=Head;
 while(currentnode!=null)
{
 count++;
 currentnode=currentnode.next;
 }
return count;
}

public Listnode deletefirstnode()
{
  
  Listnode Temp=Head;
  Head=Head.next;
  Temp.next=null;
  return Temp;
}
public Listnode deletepos(int pos)
{
Listnode currentnode=Head;
int count=1;
while(count<pos-1)
{
currentnode=currentnode.next;
}
Listnode Temp=currentnode.next;
currentnode.next=Temp.next;
Temp.next=null;
return Temp;
}

public Listnode deletelast()
{
  Listnode currentnode=Head;
while(currentnode.next.next!=null)
{
  currentnode=currentnode.next;
  
}
Listnode Temp=currentnode.next;
currentnode.next=null;
return Temp;
}
public Boolean searchkey(int key)
{
Listnode currentnode=Head;
while(currentnode!=null)
{

if(currentnode.data == key)
{
  //System.out.println("Found");
  return true;
}
currentnode=currentnode.next;
}
return false;
}
public Listnode reversell(Listnode Head)
{
Listnode currentnode=Head;
Listnode next=null;
Listnode previous=null;
//Listnode Temp3=null;
while(currentnode!=null)
{ 
//Temp=currentnode.next;
next=currentnode.next;
currentnode.next=previous;
previous=currentnode;
currentnode=next;

}
return previous; 
}
  public static void main(String[] args) {
    
    SingleLL LL=new SingleLL();

    LL.Head = new Listnode(10);
   
    Listnode second=new Listnode(90);
    LL.Head.next=second;

    //LL.Display();
    LL.addfirst(40);
    LL.addfirst(30);
    LL.addfirst(60);
    LL.Display(LL.Head);//#endregion();
    int count=LL.findlegnth(); 
    System.out.println("count is here ->" + count);
    LL.addlast(110);
    LL.addlast(95);
    LL.addpos(98, 6);
    LL.Display(LL.Head);
    Listnode reverse=LL.reversell(LL.Head);
    System.out.println("Reveres" + reverse.data);
    LL.Display(reverse);
    System.out.println("Reveres------->");
    Listnode Temp=LL.deletefirstnode();
    System.out.println("Deleted node" + Temp.data);
    LL.Display(LL.Head);
    Listnode Temp1 =LL.deletepos(2);
    System.out.println("Deleted node with pos" + Temp1.data);
    LL.Display(LL.Head);
    Listnode Temp2 =LL.deletelast();
    System.out.println("Last Deleted node ->" + Temp2.data);
    //LL.deletefirstnode();
    int Newcount=LL.findlegnth();
    System.out.println("count is here ->" + Newcount);
    LL.Display(LL.Head);
    //LL.addpos(95, 3);
    if(LL.searchkey(10))
    {
      System.out.print("found");
    }
    else{

      System.out.print("not found");
    }
  
    /*try {
      LL.searchkey(95);
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println("not found " + e);
    }*/
  }
}






