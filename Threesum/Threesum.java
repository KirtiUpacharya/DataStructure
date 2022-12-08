import java.util.*;
public class Threesum{

public void sum(int[] arr,int target)
{
Arrays.sort(arr);
int j=1;
int k=arr.length-1;
for(int i=0;i<arr.length-2;i++)
{
while(j<k)
{

int sum=arr[i]+arr[j]+arr[k];
if(sum==target)
{
  System.out.println(arr[i] + arr[j]+ arr[k]);
   j++;
   k--;
}
else if(sum<target)
{
   j++;
}else{
    k--;
}
}
}
}

public static void main(String[] args)
{
    Threesum summer=new Threesum();
    int[] arr={5,10,0,8,2,4};
     summer.sum(arr, 6);

}


}