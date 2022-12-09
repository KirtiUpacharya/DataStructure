// Adjacency M<atrix (2D array)==Graph

public class graph{

    int[][] Matrix;

    public graph(int nodes)
     {
       this.Matrix=new int[nodes][nodes];

     }
   public void addedge(int u,int v)
   {
     this.Matrix[u]=1;
     this.Matrix[v]=1;
   }
   public static void main(String[] args)
   {
      graph g=new graph(5);
      g.addedge(10,5); 
      g.addedge(5, 6);
   }

}