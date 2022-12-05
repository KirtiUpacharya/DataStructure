public class MaxGoldPath{


public void maxgold(int[][] Grid)
{

int m=Grid.length;
int n=Grid[0].length;

for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
         int gold=findmaxgold(grid,i,j,m,n,new boolean[m][n]);
         max=Math.max(max, gold);
  
    }
}
  

}
public int findmaxgold(int[][] grid,int i,int j,int m,int n,boolean[][] visited)
{

    if(i<0 || j<0 || m<i || n<j|| visited[i][j]) return 0;
    visisted[i][j]=true;
    int Left=findmaxgold(grid,i-1, j, m, n, visited);
    int Right=findmaxgold(grid,i+1, j, m, n, visited);
    int up=findmaxgold(grid,i, j-1, m, n, visited);
    int down=findmaxgold(grid,i, j+1, m, n, visited);
    visisted[i][j]=False;
    return Math.max(Left, Math.max(Right(Math.max(up,down))))+grid[i][j];
    






}





}

