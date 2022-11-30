public class BinarySProblem{

public int binaysearch(int[] arr,int x){
    
    int Low=0;
    int high=arr.length-1;
    int mid=0;
    while(Low<=high)
    {
      mid=Low+(high-Low)/2;
      if(arr[mid]==x)
      {
          return mid;
      }
      
      if(arr[mid]>x)
      {
          high=mid-1;
      }else
      {
        Low=mid+1;
      }
    
    }
    return Low;

}
public static void main(String[] args)
{ 
     BinarySProblem BSP=new BinarySProblem();
     int[] arr={2,5,8,10,30,40};
     int index=BSP.binaysearch(arr,20);
     System.out.println("index---------------");
     System.out.println(index);

}
}