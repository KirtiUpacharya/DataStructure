import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; 
public class LLAdjancematrix{
    
    int vertcises;
    LinkedList<Integer>[] adj;

    public LLAdjancematrix(int nodes)
    { this.vertcises=nodes;
      this.adj=new LinkedList[nodes];
      for(int i=0;i<nodes;i++)
      {
        this.adj[i]=new LinkedList<>();
      }

    }
    
    public void addedge(int u, int v)
    {
     this.adj[u].add(v);
     this.adj[v].add(u);
     v++;
     
    }
 
    public void DFS(int s)
    {
      //DFS uses the satck
      Stack<Integer> stack =new Stack<>();
      boolean[] ISVisited=new boolean[vertcises]; 
      stack.push(s);
      while(!stack.isEmpty())
      {

       int u=stack.pop();
       
       if(!ISVisited[u])
       { 
         ISVisited[u]=true; 
         System.out.println(u);
        for(int h:adj[u])
        {
          if(!ISVisited[h])
          {
            stack.push(h);
          }
 
        }
       }
       

      }
    }

   public void BFS(int s)
   {
        
    Queue<Integer> Q=new LinkedList<>();
    boolean[] IsVisited=new boolean[vertcises];
    Q.offer(s);
    while(!Q.isEmpty())
    {
     
    int i=Q.poll();
    System.out.println(i);
    for(int h: adj[i])
    {
      if(!IsVisited[h])
      {
         IsVisited[h]=true;
         

         Q.offer(h);

      }


    }
    }


   }

   public static void main(String[] args)
   {
     LLAdjancematrix LLA=new LLAdjancematrix(4);
     LLA.addedge(0, 1);   
     LLA.addedge(1,2); 
     LLA.addedge(2,3);
     LLA.addedge(3,0);
     //LLA.adj[0];
     LLA.DFS(0);
     //LLA.DFS(adj);
     LLA.BFS(0);
    
    }

}
