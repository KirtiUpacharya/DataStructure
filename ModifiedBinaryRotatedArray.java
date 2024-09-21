//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

       //modified binarysearch
        int[] arr=new int[]{4, 5, 6, 0, 1, 2};
        int target=0;

        int right=arr.length-1;
        int left=0;

        while(left<=right)
        {

            int mid=left+(right-left)/2;
             if(arr[mid]==target)
             {
                 System.out.println(mid);
                 return;
             }
             else{
                  if(arr[left]<= arr[mid])
                  {
                      if(arr[left]<= target && arr[mid]>target)
                      {
                            right=mid-1;
                      }
                      else{
                          left=mid+1;

                  }} else
                  {
                      if(arr[right]>= target && arr[mid]<target)

                      {
                          left=mid+1;
                      }
                      else{
                          right=mid-1;
                      }
                  }

             }

        }

    }
}