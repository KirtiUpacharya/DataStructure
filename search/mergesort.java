public class mergesort{


//private int[] sort;

public void merge(int[] arr,int[] Temp,int low,int mid,int high)
{
    for(int h=low;h<high;h++)
    {
       Temp[h]=arr[h];
    }
    int n1=arr1.length;
    int n2=arr2.length;
    int n3= n1+n2;
    int[] result=new int[n3];
    int i=low;
    int j=mid+1;
    int L=0;
   while(i<=mid && j <=high)
   { 
       if(Temp[i]<Temp[j])
       {
         arr[L]=Temp[i];
         i++;
       }
       else{
        arr[L]=Temp[j];
           j++;
       }
       L++;
   }
  while(i< mid)
  {
    arr[L]=Temp[i];
    i++;
    L++;
  }
  while(j<high)
  {
    arr[L]=Temp[j];
    j++;
    L++;
  }
}
public void sort(int[] arr1,int[] Temp,int low,int high)
{   low=0;
    high=arr1.length;
    int mid=0;
    if(low<high)
    {

        mid=low+(high-low)/2;
        sort(arr1, Temp, low, mid);
        sort(arr1, Temp, high, mid);  
        merge(arr1, Temp,low,mid,high);

    }
   
    
}
//private void extracted2(int[] arr1, int[] Temp, int high, int mid) {
    //sort(arr1,Temp, mid+1, high);
//}
//private void extracted(int[] arr1, int[] Temp, int low, int mid) {
    //sort(arr1,Temp, low, mid);
//}

public static void main(String[] args)
{
  mergesort merges=new mergesort();
  int arr1[]={1,2,4,5,3,5,7,8};
  //int arr2[]={3,6,7,8,9};
  //int[] result=merges.merge(arr1, arr2);
  /*for (int k=0;k<result.length-1;k++)
  {
      System.out.print(result[k]);
  }*/
  //int Temp={};
merges.sort(arr1,new int[arr1.length], 0, arr1.length);
for (int k=0;k<arr1.length-1;k++)
    {
        System.out.print(arr1[k]);
    }
 
 
}





}