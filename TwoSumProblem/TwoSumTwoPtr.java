import java.util.*;
public class TwoSumTwoPtr{



public int[] Twosum(int[] arr,int target)
{

Arrays.sort(arr);
 int[] result=new int[2];
 int Left=0;
 int Right=arr.length-1;
 while(Left<Right)
 {
      int sum=arr[Left]+arr[Right];
      if(sum==target)
      {
          result[0]=Left;
          result[1]=Right;
          return result;
      }else if(sum>target)
      { 
          Right--;

      }else{
          Left++;
      }
 }
return new int[0];
}
public static void main(String[] args)
{

    TwoSumTwoPtr s=new TwoSumTwoPtr();
    int[] arr={8,5,6,10,4,5,3};
    s.Twosum(arr, 7);
}


}