

public class advancedLL {
   private static Listnode Head;
    public advancedLL(advancedLL.Listnode head) {
    Head = head;
  }

    public static class Listnode{

     private int data;
     Listnode next;
    //private int i;

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

//find middle node using slow pointer and fast pointer. Asn-Middle node->slow pointer,while fastpointer check as null.

//Remove Duplicates from the sorted ll
public Boolean removeduplicatesfromsortLL()
{
Listnode curreListnode=Head;
while(curreListnode!=null)
{
  if(curreListnode.data==curreListnode.next.data)
  {
    return true;
  }
  curreListnode=curreListnode.next;
}
return false;
}


  public advancedLL.Listnode findmiddlenode(advancedLL.Listnode listnode, advancedLL.Listnode listnode2)
{
advancedLL.Listnode slowptr1 =Head;
advancedLL.Listnode fast =Head;
while(fast != null )
{
advancedLL.Listnode listnode3 = listnode2=fast.next.next;
}
return slowptr1;
}

  public advancedLL.Listnode findnthnodefromlast(advancedLL.Listnode listnode, advancedLL.Listnode listnode2, int n)
  {
  advancedLL.Listnode slowptr =listnode;
  advancedLL.Listnode fastptr =listnode;
  int count=0;
  while(count < n)
  {
  fastptr=fastptr.next;
  count++;
  }
  while(fastptr != null)
  {
  fastptr=fastptr.next;
  slowptr=slowptr.next;
  
  }
  return slowptr;
  }

  public static void main(String[] args) {
    
    advancedLL LL=new advancedLL(Head);

    LL.Head = new Listnode(10);
   
    Listnode second=new Listnode(90);
    LL.Head.next=second;

    //LL.Display();
    LL.addfirst(40);
    LL.addfirst(30);
    LL.addfirst(30);
    LL.addfirst(60);
    LL.addfirst(60);
    LL.Display(LL.Head);//#endregion();
    LL.addlast(110);
     LL.addpos(98, 6);
    LL.Display(LL.Head);
    Listnode middlenode= LL.findmiddlenode(LL.Head, fast);
    System.out.println("Middle node ->" + middlenode.data);
    Listnode nthfromlast= LL.findnthnodefromlast(LL.Head, LL.Head.next, 3);
    System.out.println("nth node ->" + nthfromlast.data);
    Boolean removeduplicates=LL.removeduplicatesfromsortLL();
    if(removeduplicates)
    {
      System.out.println("Duplicated found");
    }
    else{
      System.out.println("Duplicated not found");
    }
  }
}






