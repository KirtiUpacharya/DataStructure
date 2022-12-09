public class Hash
{

private HashNode[] Buckets;
private int capacity;
private int size;
public Hash()
{
    this(10);
}
public Hash(int capacity)
{
     this.capacity=capacity;
     this.Buckets=new HashNode[capacity];
     this.size=0;


}
private class HashNode{

private int key;
private String value;
private HashNode next;

public HashNode(int Key,String Value)
{
 
this.key=Key;
this.value=Value;
this.next=null;
}
}

public void put(int key,String value)
{   
    int index=key%Buckets.length;
    HashNode Head=Buckets[index];
    //=Head;// Initialized head
    while(Head!=null)
    {
       if(Head.key==key)
       {
           Head.value=value;
           return;
       }


     Head=Head.next;   
    }
    Head=Buckets[index];
    HashNode node=new HashNode(key,value);
    Buckets[index]=node;
    node.next=Head;
    Buckets[index]=node;
    size++;
}
public String get(int key)
{
   int index=key%Buckets.length;
   HashNode head=Buckets[index];
   while(head!=null)
   {

     if(head.key==key)
     {   
        System.out.println("Found");
         return head.value;
     }
     head=head.next;
   }
   System.out.println("Not Found");
   return null;

}

public int remove(int key){
int index=key%Buckets.length;
HashNode Head=Buckets[index];
HashNode previous=null;
while(Head!=null)
{
   if(Head.key==key)
   {
       break;
       
   }
previous=Head;
 Head=Head.next;
 
}
   
if(Head==null)
{return 0;}
if(previous!=null)
{
        previous.next=Head.next;
}else{
        Buckets[index]=Head.next;
}

size--;
System.out.println("-----" + size);
return size;

}





public static void main(String[] args)
{
    Hash H=new Hash();
    H.put(2,"value");
    H.put(3,"value");
    H.get(2);
    H.remove(2);
   
}

}