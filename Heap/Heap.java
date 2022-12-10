public class Heap{

Integer[] Heap;
int n;

public Heap(int capacity)  //Constructor
{
this.Heap=new Integer[capacity];
int n=0;
}

public int insert(int x)
{

if(n==Heap.length-1)
{
    resize(2*Heap.length);
}
n++;
Heap[n]=x;
swim(n);
return n;
}
public void swim(int k)// reheapify-
{
while((n>1) && (Heap[k/2]< Heap[k]))
{
    int Temp=Heap[k];
    Heap[k]=Heap[k/2];
    Heap[k/2]=Temp;
    k=k/2;
  
}

}

public int delete()
{
int Max=Heap[n];
swap(1,n);
n--;
sink(1);// pls reheapify the first
Heap[n+1]=null;
if(n==(Heap.length-1/4))
{
    resize((Heap.length)/2);
}
return max;

}
public void sink(int k) // children top down reheapify
{
    int i=2*k;
    while(2*k <=n )
    {
        if(i<n && Heap[i]<Heap[i+1])
        {
          i++;
        }
        if(Heap[k]>Heap[i])
        {
            break;
        }
        swap(k,i);
        k=i;
    }
    }
public void swap(int i,int j)
{
    int Temp=Heap[i];
    Heap[i]=Heap[j];
    Heap[j]=Temp;
}
public void resize(int j)
{
    int[] Temp=new int[j];
for(int i=0;i<Heap.length;j++)
{
     Temp[i]=Heap[i];
}
Heap=Temp;
}
public static void main(String[] args)
{
    Heap h=new Heap(5);
    h.insert(10);
    h.insert(15);
    h.insert(30);
    int n=h.insert(5);
    System.out.println(n);
    h.delete();
    System.out.println(n);
}




}