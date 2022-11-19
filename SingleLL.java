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
    

 public void Display()
 {
 Listnode currentnode=Head;
 while(currentnode!=null)
 {
     System.out.print("Here is Linkedlist" + currentnode.data + "->");
     currentnode=currentnode.next;  
}
 System.out.print("null");
 System.out.println();
}
public void add(int data)
{
  Listnode firstnode= new Listnode(data);
  firstnode.next =Head;
  Head=firstnode;


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

  public static void main(String[] args) {
    
    SingleLL LL=new SingleLL();

    LL.Head = new Listnode(10);
   
    Listnode second=new Listnode(90);
    LL.Head.next=second;

    //LL.Display();
    LL.add(40);
    LL.add(30);
    LL.add(60);
    LL.Display();
    int count=LL.findlegnth();
    System.out.println("count is here ->" + count);
  }
}






