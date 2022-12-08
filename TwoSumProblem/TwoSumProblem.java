import java.util.HashMap;
import java.util.*;
public class TwoSumProblem{

    public int[] twosum(int[] arr,int target)
    {
       int[] result=new int[2];
       Map<Integer,Integer> map=new HashMap<>( );

       for(int i=0;i< arr.length;i++)
       {
         if(!map.containsKey(target-arr[i]))
         {
            map.put(arr[i],i);

         }else{

            result[0]=i;
            result[1]= map.get(target-arr[i]);// map.get(key);

             return result;   
         }

        }

      
         return result;  
}

public static void main(String[] args)
{
    TwoSumProblem s=new TwoSumProblem();
    int[] arr={2,4,6,9,16};
    
    s.twosum(arr, 6);

}


}