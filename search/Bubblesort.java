import java.util.*;
public class Bubblesort{

//bubble sort; we useually have ascending order eleemnts
public int[] bubblesort(int[] arr)
{
 int n= arr.length-1;
 for(int i=0;i<n;i++)
 {
   Boolean isSwapped=false;
   for(int j=0;j<n-i;j++)
   {
      if(arr[j]>arr[j+1])
      {
        int Temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=Temp;
        isSwapped=true;
      }
      isSwapped=false;

   }
   if(isSwapped)
   break;
 }
 for(int i=0;i<n-1;i++)
 {
     System.out.print("--" + arr[i]);
 }
 return arr;
}


public static void main(String[] args)
{
    Bubblesort BBS=new Bubblesort();
    int[] ar={20,12,34,56,1,3,0};
    int[] y=BBS.bubblesort(ar);

     for(int k=0;k<y.length;k++)
 {
     System.out.println("--" + y[k]);
 }
    
}
}