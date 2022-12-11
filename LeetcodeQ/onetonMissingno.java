public class onetonMissingno{


public void missing()
{
int j=0;
int[] arr={1,7,8,2,5,4,6};
//arr[i]=i+1;
int mis=0;


{ //index=val-1;
    int correct=arr[j]-1;
   if(arr[j]!=arr[correct])
   {   
       swap(arr,correct,j);
       
   }else{j++;}
}
while(j<arr.length)
{   int correct=arr[j]-1;
   if(arr[j]!=arr[correct])
   {   
    mis=arr[j];
       
   }  else{j++;}
}
System.out.println(mis);

}

public void swap(int[] arr,int i,int j)
{
   int Temp=arr[i];
   arr[i]=arr[j];
   arr[j]=Temp;
}
public static void main(String[] args)
{
    onetonMissingno m=new onetonMissingno();
    m.missing();
    //System.out.println(miss);
}

}