public class LinearSearch{

int[] Arr={9,12,34,1,3,5,7,0};

public int Search(int x,int [] arr)
{
    int n=arr.length;
 for(int i=0;i<n;i++)
 {
    if(arr[i]==x) 
    {
        System.out.println(i);
        return i;
    }
 }
 System.out.println("Not Found ");
return -1;

}
public static void main(String[] args)
{
LinearSearch LLsearch=new LinearSearch();
LLsearch.Search(10,LLsearch.Arr);


}
}