import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree{
    Treenode root=null;
    private class Treenode{
    
        Treenode Rightpointer;
        Treenode Leftpointer;
        int Data;
    
    
        public Treenode(int Data)
        {
         this.Data=Data;
         Rightpointer=null;
         Leftpointer=null;
        }
    }
public void preorder(Treenode root)
{

if(root==null)
return;
System.out.print(root.Data);
preorder(root.Leftpointer);
preorder(root.Rightpointer);
}

public void iterativepreeorder(Treenode root)
{
Stack<Treenode> stack=new Stack<Treenode>();
stack.push(root);
Treenode Temp1;
while(!stack.isEmpty())
{
  Temp1=stack.pop();
  System.out.println(Temp1.Data);
  if(Temp1.Rightpointer!=null)
  {
    stack.push(Temp1.Rightpointer);
  }
  if(Temp1.Leftpointer!=null)
  {
    stack.push(Temp1.Leftpointer);
  }
}
}
public void inorder(Treenode root)
{
if(root==null)
return;
inorder(root.Leftpointer);
System.out.println(root.Data);
inorder(root.Rightpointer);
}
/*public void GenerateTree(int data)
{
Treenode Temp=root;

if(data<(Temp.Data))
{
Treenode leftside=new Treenode(data);
Temp.Leftpointer = leftside;
Temp=Temp.Leftpointer;
}
else{
Treenode rightside=new Treenode(data);
Temp.Rightpointer=rightside;
Temp=Temp.Rightpointer;
}
}*/

// Below tree trvaseral method is a recursive tree preorder traversal. Which uses the stack internally.

/*public void preorder(Treenode root)
{
//Treenode Temp1=root;
if(root==null)
return;
System.out.print(root.Data);
preorder(root.Leftpointer);
preorder(root.Rightpointer);
}*/

/*public void iterativepreorder(Treenode root)
{

Stack <Treenode> stack=new Stack<Treenode>();
stack.push(root);
Treenode Temp1;
if(root==null)
return;
while(!stack.isEmpty())
{
Temp1=stack.pop(); 
System.out.print(Temp1.Data);
if(Temp1.Rightpointer!=null)
{
  stack.push(Temp1.Rightpointer);
}
if(Temp1.Leftpointer!=null)
{
  stack.push(Temp1.Leftpointer);
}
}
}*/
public void  postorder(Treenode root)
{
if(root==null)
return;
postorder(root.Leftpointer);
postorder(root.Rightpointer);
System.out.println(root.Data);
}
public void Iterativeinorder(Treenode root)
{
Treenode Temp2=root;
Stack<Treenode> stack = new Stack<>();
if(Temp2==null)
return;
while((!stack.isEmpty()) || Temp2!=null)
{
if (Temp2!=null)
{
  stack.push(Temp2);
  Temp2=Temp2.Leftpointer;
}
else{
  
  Temp2=stack.pop();
  System.out.println(Temp2.Data);
  Temp2=Temp2.Rightpointer;
}
}
}

public void iterativepostorder(Treenode root)
{
Treenode current=root;
Stack<Treenode> stack=new Stack<>();
Treenode Temp4;
while((!(stack.isEmpty())) || current!=null )
{
if(current !=null)
{
stack.push(current);
current=current.Leftpointer;
}else
{ 
  Temp4=stack.peek().Rightpointer;
  if(Temp4==null)
  {
  Temp4=stack.pop();
  System.out.println(Temp4.Data);
  
  while(!stack.isEmpty() && Temp4==stack.peek().Rightpointer)
  {
    Temp4=stack.pop();
    System.out.println(Temp4.Data);
  }
  }
else{
  current=Temp4;
}
}
}}

public void Levelordertraversal()
{
Queue<Treenode> queue=new LinkedList<>();
Treenode Temp5;

queue.add(root);
while(!(queue.isEmpty()))
{
  //queue.add(root);
  Temp5=queue.poll();
  System.out.println(Temp5.Data);
  
  if(Temp5.Leftpointer!=null)
  {
     
     queue.add(Temp5.Leftpointer);
     
  }
  if(Temp5.Rightpointer!=null)
  {
    queue.add(Temp5.Rightpointer);
  }
}

}


//find maximum value in the binary tree.
public int findmaxvalue(Treenode root)
{
  //Base case
  if(root==null)
  {
    return Integer.MIN_VALUE;
  }
int result=root.Data;
int Left=findmaxvalue(root.Leftpointer);
int Right=findmaxvalue(root.Rightpointer);
if(Left>result)
{
 result=Left;
}
if(Right>result)
{
 result=Right;
}

return result;
}
public Treenode InsertBinarySearch(Treenode root,int value)
{
if(root==null)
{
  root=new Treenode(value);
  return root;
}
if(value<root.Data)
{
  root.Leftpointer=InsertBinarySearch(root.Leftpointer, value);

}else{
  root.Rightpointer=InsertBinarySearch(root.Rightpointer, value);
}
return root;
}
 public static void main(String[] args)
 {
   tree treee=new tree();
   treee.root=treee.new Treenode(10);
   Treenode second=treee.new Treenode(20);
   Treenode third=treee.new Treenode(30);
   Treenode fourth=treee.new Treenode(40);
  
   treee.root.Leftpointer= second;
   treee.root.Rightpointer=third;
   third.Rightpointer=fourth;
   System.out.println("Binary tree insertion-------------------->");
   Treenode insertion=treee.InsertBinarySearch(treee.root, 20);
   System.out.println(insertion.Data);
   treee.Levelordertraversal();
   //treee.GenerateTree(20); 
  
   //treee.preorder(treee.root);
   //treee.iterativepreorder(treee.root);
   treee.preorder(treee.root); 
   System.out.println("");
   treee.iterativepreeorder(treee.root);
   System.out.println("");
   treee.inorder(treee.root);
   System.out.println("-------------------->");
   treee.Iterativeinorder(treee.root); 
   System.out.println("-------------------->");
   treee.postorder(treee.root);
   System.out.println("New Function-------------------->");
   treee.iterativepostorder(treee.root);
   System.out.println("Levelorder-------------------->");
   treee.Levelordertraversal();
   System.out.println("MAx Value-------------------->");
  int result=treee.findmaxvalue(treee.root);
  System.out.println(result);
  
 }
 }