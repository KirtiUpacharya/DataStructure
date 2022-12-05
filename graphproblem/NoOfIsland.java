public class NoOfIsland{

public int island(int[][] Grid)
{
   int m=Grid.length;
   int n= Grid[0].length;

   int island=0;
 if(Grid==null) return 0;
   for(int i=0;i<m;i++)
   {
      for(int j=0;j<n;j++)
     {
       
        if(Grid[i][j]==1)
        {
        // incrrese the island count
        ++island;
        //change the horizonatal and vertical values from 1 to 0
        //changetowater(Grid,i,j);
        changetowater(Grid, i, j);
     
 
        }
        

    }
    

   }
 System.out.println(island);
  return island;

}

public void changetowater(int[][] Grid,int i,int j)
{
    if(i<0 || i>=Grid.length || j<0 || j>=Grid[0].length || Grid[i][j]==0) return;
    Grid[i][j]=0;
        changetowater(Grid, i-1, j);//Left
        changetowater(Grid, i+1, j);//Right
        changetowater(Grid, i, j-1);//Up
        changetowater(Grid, i, j+1);//Left

}


public static void main(String[] args)
{
    NoOfIsland NM=new NoOfIsland();
    int[][] Grid={{1,0,0,1},{1,0,1,1},{1,0,1,1},{1,1,1,1}};
    NM.island(Grid);
    //NM.island(Grid);


}





}