public class DutchFlag{

public void Flag(int[] arr)
{

int i=0;// i will point to 1's
int j=0;// j wil points to 0's
int k=arr.length-1; /// k will points to 2's

while(i<=k)
{

if(arr[i]==0)
{ 
  swap(arr,i,j);
  i++;
  j++;
 
}

else if(arr[i]==1)
{
    i++;

}
else if(arr[i]==2)
{
swap(arr,i,k);
k--;
}
}
}

public void swap(int[] arr,int L, int M) // Rplace L by M L is holding the value which resided in M.
{
    int Temp=arr[L];
    arr[L]=arr[M];
    arr[M]=Temp;
}
public static void main(String[] args)
{

DutchFlag DF=new DutchFlag();
int[] arr={1,0,2,2,2,0,0,0,1,1,1,0};
DF.Flag(arr);
for(int y=0;y<arr.length-1;y++)
{
 System.out.print("-" + arr[y]);

}

}

}