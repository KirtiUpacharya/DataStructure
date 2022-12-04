public class Maxsumsubarray{

public int maxsum(int[] arr)
{
  int currentsum=arr[0];
  int maxsum=arr[0];
  for(int i=0;i<=arr.length-1;i++)
  { 
     currentsum=currentsum+arr[i];
     if(currentsum < arr[i])
     {
         currentsum=arr[i];
     }
    if(currentsum > maxsum)
    {
           maxsum=currentsum;

    }

  }
 System.out.println(maxsum);
  return maxsum;


}

public static void main(String[] args)
{
Maxsumsubarray ms=new Maxsumsubarray();
int[] arr={-7,5,2,9,0,-3,5};
ms.maxsum(arr);
}

}