import java.util.Stack;

public class QueueusingStack
{
    Stack<Integer> s1 =new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
public int QSdequeue(int data)
{

//s1.push(data);
while(!s1.isEmpty())
{
 s2.push(s1.pop());

}
int result=s2.pop();
while(!s2.isEmpty())
{
   s1.push(s2.pop());
}
return result;
}
public void QSenqueue(int data)
{
 s1.push(data);
 //s1.push

}
public static void main(String[] args)
{
    QueueusingStack QS=new QueueusingStack();
    
    QS.QSenqueue(10);
    QS.QSenqueue(20);
    QS.QSenqueue(30);
    QS.QSenqueue(40);
    int result=QS.QSdequeue(40);
    System.out.println(result);

}

}