public class priorityQ{

    Integer[] Heap;
    static int n;
    priorityQ(int capacity)
    {
       Heap=new Integer[capacity+1];
       n=0;
    }
    public boolean isEmpty(int n)
    {
        return n==0;
    }
    public int size()
    {
        return n;
    }
    public void deletemaxHeap()
    {
        swap(1);
        n--;
        Heap[n+1]=null;
        sink(1);
        if((n<=0) && n<=(Heap.length)/4)
        {
            resize(Heap.length/2);
        }
   for(int j=1;j<=n;j++)
   {
     System.out.print(" " + Heap[j] ); 
   }
        
    }
    public void sink(int index)
    { int Temp5;
        int i=2*index;
        int j= 2*index+1;
        while(n<=index)
        {
            if(Heap[i] < (Heap[j]))
            {
              Temp5=Heap[j];
              j++;
            }
            else
            {
              Temp5=Heap[i];  
              i++;
            }
            if((Temp5) < Heap[index])
            {
               break;
            }
            else{
                int Temp6=Heap[index];
                
                Heap[index]=Temp5;
                Temp5=Temp6;
            }

        }
       
    }
    public void swap(int index)
    {
      int Temp=Heap[n];
      Heap[n]=Heap[index];
      Heap[index]=Temp;

    }
    public void insertHeap(int x)
    { 
     if(n==(Heap.length))
     {
        resize(2*Heap.length);
     }
     n++;
     Heap[n]=x;
     swim(n);
     //swim(n);
     //return Heap;
    }
    public void printHeap()
    {
        for(int i=1;i<=n;i++)
     {
        System.out.println(Heap[i]); 
     }
    }
    public void swim(int k)
    {
       if(k>1 && Heap[k]>Heap[k/2])
       {
           int Temp= Heap[k];//parent
           Heap[k]=Heap[k/2];//parent=child
           Heap[k/2]=Temp;
           k=k/2;

       } 
    }
    public void resize(int capacity)
    {
        Integer[] Temp1=new Integer[capacity];
        for(int i=0;i<(Heap.length);i++)
        {
         Temp1[i]=Heap[i];
        }
       Heap=Temp1;
    }
public static void main(String[] args)
{
   priorityQ priority=new priorityQ(5);
   //Boolean p=priority.isEmpty(0);
  // int size =priority.size();
   //System.out.println("Size" + size + "p"+ p);
   priority.insertHeap(10);
   priority.insertHeap(30);
   priority.insertHeap(20);
   priority.printHeap();
   int size =priority.size();
   System.out.println("Size" + size);

   System.out.println("---------------------- ");
   priority.deletemaxHeap();

 
}
 
}