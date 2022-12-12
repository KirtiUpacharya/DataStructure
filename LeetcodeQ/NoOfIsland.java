public class NoOfIsland{

public void island(char[][] grid)
{
int m=grid.length;
int n=grid[0].length;
boolean[][] visited=new boolean[m][n];
int noofisland=0;
for (int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(!visited[i][j] && grid[i][j]==1)
        {   
            
            dfs(grid,i,j,visited);
            noofisland++;
        }

    }

}

}
public void dfs(char[][] grid,int i,int j,boolean[][] visited)
{

if(i<0 || j<0 || i>=grid.length || j>=grid[0].length|| grid[i][j]==0 || visited[i][j] )
return;
visited[i][j]=true;
dfs(grid, i, j-1, visited);//left
dfs(grid,i+1,j,visited);//up
dfs(grid,i,j+1,visited);
dfs(grid,i-1,j,visited);



}
public void DFS(int s)//Stack
{
Stack<> stack=new Stack<>();
boolean[] visited=new boolean[nodes];
stack.push(s);
while(!stck.isEmpty())
{
    int u=stack.pop();
    if(!visited[u])
    {
        visited[u]=true;
        for(int u: adj[u])
        {
            if(!visited[u])
            {
                stack.push(u);
            }


        }


    }


}


}

public static void main(String[] args)
{
    NoOfIsland nm=new NoOfIsland();
    char[][] grid=
    nm.island(grid);
}

}