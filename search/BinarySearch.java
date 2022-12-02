public class BinarySearch{
    Integer[] arrr={2,3,6,8,10,45,56,67,89,90,};
    public int search(int x)
    {
     int High=arrr.length-1;
     int Low=0;
     int mid=0;
     while(Low<=High)
     {
      mid=(High+Low) / 2;     //Mid should be dynamic
       
     if(arrr[mid]==x)
     {
       System.out.println("found" + mid);
       return mid;
     }
     if(arrr[mid]>x)
     {
       Low=mid-1;
     }
     if(arrr[mid]<x)
     {
       High=mid+1;
     }
    }
     return -1;
    }
      public static void main(String[] args)
      {
         BinarySearch BB=new BinarySearch();
         BB.search(56);
        //Systm.out.println("Hey" + i);
      }
    }

