  public class FabDP{

//Rrecursive way
public int fab(int n)
{
if(n==0) 
return 0;
if(n==1)
return 1;
int Left=fab(n-1);
int right=fab(n-2);
int result=Left+right;
return result;
}

public void TabulationDP(int n)//Bottom uo Approach
{
  int[] result=new int [n+1];
  result[0]=0;
  result[1]=1;
    for(int i=2;i<=n;i++)
    {
  
       result[i]=result[i-1]+result[i-2];

    }
    for(int j=0;j<=n;j++) 
    {

       System.out.println(result[j]);

    }
}

 /*public int[] fibtop(int[] memo,int n)
{
    if(memo[n]==0)
    { 
        if(n<2)
   {
       memo[n]=n;

   }else
   {
      int Left=fibtop(memo, n-1);
      int right=fibtop(memo, n-2);
      memo[n]=Left+right;

    }

   }

   return memo[n];


}*/
public int topfabb(int[] memo,int n)
{
    if(memo[n]==0)
    {
        if(n<2)
        {
          memo[n]=n;
        }else
        {
            int Left=topfabb(memo, n-1);
            int Right=topfabb(memo, n-2);
            memo[n]=Left+Right;

        }
    }
    return memo[n];
}
public static void main(String[] args)
{
    FabDP ff=new FabDP();
    int n=8;
    for(int i=0;i<n;i++)
    { 
        System.out.println( ff.fab(i));

    }
    System.out.println("------");
    ff.TabulationDP(6);
    int nj=8;
    int[] memo=new int[nj+1];
    ff.topfabb(memo, nj);
    
}

  }