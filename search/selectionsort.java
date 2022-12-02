public class selectionsort{

    public int[] selection(int[] arr)
    {  int n=arr.length;
       for(int i=0;i<n-1;i++)
       {
          int min=i;
        for( int j=i;j<n;j++)
        {
          if(arr[min]>arr[j])
          {
              min=j;
          }
        }
       int Temp=arr[i];
       arr[i]=arr[min];
       arr[min]=Temp;
      }
      return arr;
    }
      public static void main(String[] args)
      {
        selectionsort ss=new selectionsort();
        int[] arr={3,6,1,8,2};
        int[] a=ss.selection(arr);
        for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]);

        }
        
      }

       
    }

