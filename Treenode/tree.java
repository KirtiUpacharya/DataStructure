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
  Stack<Treenode> stack =new Stack<>();
  Treenode Temp3=root;
  stack.push(root);
  while(!stack.isEmpty())
  {

   while((Temp3.Rightpointer!=null) && (Temp3.Leftpointer!=null))
   {
    if(Temp3.Rightpointer!=null)
    {
      stack.push(Temp3.Rightpointer);
    }
    else{
     if(Temp3.Leftpointer!=null)
     {
       stack.push(Temp3.Leftpointer);
     }
    }
    Temp3=stack.pop();
    System.out.println(Temp3.Data);
   }
  }
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
 }
 }