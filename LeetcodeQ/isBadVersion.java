public class isBadVersion{



public static int isBadVersion(int n)
{
   int low=1;
   int high=n;
   int result=n;
   while(low<=high)
   {
     int mid=low+(high-low)/2;
    if(isbadversion(mid))
    {
        result=mid;
        high=mid-1;

    }else{
        low=mid+1;
    }
   }
   return result;
}
public static void main(String[] args)
{
 isBadVersion(9);

}
}