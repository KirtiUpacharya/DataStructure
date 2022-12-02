public class square{

    public int[] sortedsquare(int[] arr)
    {
    int i=0;// first pointer
    int j=arr.length-1;// last poinnter
    int k=arr.length;
    int[] result=new int[arr.length];
    for(k=arr.length-1;k>=i;k--)
    {
     if(Math.abs(arr[i])> Math.abs(arr[j]))  
     {
       result[k]=arr[i]*arr[i];
       i++;


     }
     else{
      result[k]=arr[j]*arr[j];

      j-- ;

     }
     
     
    }
   return result;
}
public static void main(String[] args)
{
square ss=new square();
int[] arr= {-9,-8,-5,1,4,7,9,10};
int[] result=ss.sortedsquare(arr);
for(int L=0;L<result.length;L++)
{
    System.out.println(result[L]);
} 

}


}