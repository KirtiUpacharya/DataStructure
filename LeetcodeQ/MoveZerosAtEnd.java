public class MoveZerosAtEnd{

public int[] move()
{
int[] arr={2,6,9,0,4,0};
int i=0;
int j=arr.length-1;

//for(int i=arr.length-1;i>=0;i++)
while(i<j)
{
 if(arr[i]==0 && arr[j]!=0)
 {
     swap(arr[i],arr[j]);
    
 }
  if(arr[i]!=0)
  {
      i++;
  }   
j--;
}
return arr;
}
public void swap(int i, int j)
{
    int temp=i;
    i=j;
    j=temp;

}
public static void main(String[] args)
{
    MoveZerosAtEnd h=new MoveZerosAtEnd();
    int[] arr=h.move();
    for(int i=0;i<arr.length-1;i++)
    {
        System.out.println(arr[i]);
    }
}
}