public class Insertionsort{

public int[] insertions(int[] arr)
{
 int n=arr.length;
 for(int i=1;i<n;i++)
 {
   int j=i-1;
   int Temp=arr[i];
   while(j>=0 && arr[j]>Temp)
    {
         //int Temp1=arr[j];
         //arr[j]=arr[j+1];
         //arr[j+1]=Temp1;
         arr[j+1]=arr[j];
         j=j-1;

    }
   arr[j+1]=Temp;
}
return arr;

}

public static void main(String[] args)
{
  Insertionsort inserts=new Insertionsort();
 int[] a={5,2,3,7,8,10,1};
  int[] b=inserts.insertions(a);
  //int[] b = inserts.insertionss(a);
 for(int k=0;k<(b.length)-1;k++)
 {
     System.out.println(b[k]);
 }
  
}

}