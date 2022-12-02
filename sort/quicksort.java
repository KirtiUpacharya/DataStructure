public class quicksort{

public void sort(int[] arr, int Low,int High)
{
if(Low<=High)
{
  int p=partitions(arr,Low,High); 
  sort(arr,Low,p-1);
  sort(arr,p+1,High);
}}
public int partitions(int[] arr,int low,int high)
{  //int n=arr.length;
   int pivot=arr[high];
   int i=low;
   int j=low;
while(i <= high)
{

if(arr[i]<=pivot)
{
 int Temp= arr[i];
 arr[i]=arr[j];
 arr[j]=Temp; 
 j++;
}
i++;
}
return j-1;
}
public static void main(String[] args)
{
quicksort ss=new quicksort();
int[] arr={10,7,11,15,3,7,15};

ss.sort(arr, 0, arr.length-1);
for(int l=0;l<arr.length-1;l++)
{
 System.out.println(arr[l]);
}
}
} 












