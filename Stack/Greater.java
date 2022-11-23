import java.util.Stack;

public class Greater{


public int[] findgreat(int[] arr)
{
    Stack <Integer> stack=new Stack<Integer>();
    int[] result={arr.length};
    for (int i=(arr.length-1);i<=0;i--)
    {
     
    if(!stack.isEmpty())
    {
     while(!stack.isEmpty() && arr[i]>stack.peek())
     stack.pop();
    }
     if(stack.isEmpty())
     {
        result[i]=-1; 
     }
     else
     {
        result[i]=stack.peek(); 
     }
     stack.push(arr[i]);
    }

return result;
}

public static void main(String[] args)
{

Greater greatnext=new Greater();
int[] arr={9,8,2,3,5,7,1};
int[] result= greatnext.findgreat(arr);
int n=result.length-1;
for(int i=0;i<n;i++)
{
   
   System.out.println(result[i]);
}
}
}

