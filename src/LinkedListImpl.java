public class LinkedListImpl {
    Node head;
    
    class Node{
        Integer data;
        Node next;
    Node(Integer data)
    {
        this.data=data;
        next=null;
    }
    }
 //Printing linkedlist 
public void Linkedlistprint()
{
Node n=head;
while(n != null)
{
    System.out.println(n.data);
    n=n.next;
}

}

public static void main(String[] args) 
{
    LinkedListImpl ll=new LinkedListImpl();
    Node first=ll.new Node(10);
    ll.head=first;
  
    Node second=ll.new node(20);
    first.next=second;
}

    
}
