public class arrageoddevenminmaxpos{

public void arrage(int[] arr)
{  int max=arr[arr.length-1]+1;
    int mxindx=arr.length-1;
    int minidx=0;
    for(int i=0;i<arr.length;i++) 
    {
      if(i%2==0)//even//max
      {
        arr[i]=arr[i]+(arr[mxindx]%max)*max;
        mxindx--;

      }else{


        arr[i]=arr[i]+(arr[minidx]%max)*max;
         minidx++;
      }
    }
    for(int L=0;L<arr.length;L++)
    {
       arr[L]=arr[L]/max;
       System.out.println(arr[L]);
    }

    

}


public static void main(String[] args)
{

    arrageoddevenminmaxpos aa=new arrageoddevenminmaxpos();
    int[] arr={2,3,4,6,8,10,11};
    aa.arrage(arr);

}


}