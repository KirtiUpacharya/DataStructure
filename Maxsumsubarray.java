public class Maxsumsubarray{


public int maxsum(int[] arr,int k)
{ int windowsum=0;
    int Maxsum=0;
    int start=0;
for(int i=0;i<arr.length-1;i++)
{

windowsum= windowsum+arr[i];
while(i<=k-1)
{
Maxsum=Math.max(Maxsum,windowsum);
windowsum=windowsum-arr[i];
start++;

}



}
System.out.println(Maxsum);
return Maxsum;
}
public static void main(String[] args)
{
    Maxsumsubarray a=new Maxsumsubarray();
    int[] arr={2,5,7,8,1,0};
    a.maxsum(arr, 2);
}


}