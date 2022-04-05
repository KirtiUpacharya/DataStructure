import java.util.*;
import java.util.Iterator;



public class ArrayListFirst
{
 


public void addelement()
 {
  /*ArrayList<String> li = new ArrayList<String>();
   li.add("Hello");
   li.add("Pratik");
   System.out.println(li);
   //for loop
   for(String s:li)
    {
      System.out.println(s);
    }
   //stream with Lambda
   li.stream().forEach(ele -> System.out.println(ele));
    // iterator
    Iterator<String> it=li.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
    } 
    ArrayList<Integer> lis =new ArrayList<Integer>(Arrays.asList(10,20,30)); 
    System.out.println(lis);
    ArrayList<Integer> Clonelis=(ArrayList<Integer>)lis.clone();
    System.out.println(Clonelis);
    System.out.println("c------");
    lis.addAll(Clonelis);
    System.out.println(lis);
    System.out.println("l------");
    lis.add(22);
    System.out.println(lis);
    if(lis.equals(Clonelis))
    {System.out.println(lis);}
    lis.removeAll(Clonelis);
    System.out.println(lis);
    Clonelis.clear();
    System.out.println(Clonelis);
    System.out.println(lis.indexOf(10)<0);
    //int num;
    System.out.println(lis.removeIf(num->num>20));
    System.out.println(lis);
    System.out.println("---");*/
    //Object
    //object arr[]=Clonelis.toArray();
    //System.out.println(Arrays.toString(arr));
     // for(object o:Clonelis) 
      //{
      //    System.out.print((String)o);
      //}
   
   ArrayList<Integer> L1=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,80,90,110,67,87));
   ArrayList<Integer> L2=new ArrayList<Integer>(Arrays.asList(20,30,40,50,60,70,65,34,23,12));
   //ArrayList<Integer> CloneL1=new ArrayList<Integer>();
   ArrayList<Integer> CloneL1=(ArrayList<Integer>)L1.clone();
   System.out.println(CloneL1);

   L1.removeAll(L2);
   System.out.println(L1);
   L2.removeAll(CloneL1);
   System.out.println(L2);
   L2.size();
   System.out.println(L2.size());
   ArrayList<Integer> res1=new ArrayList<Integer>(L2.size());
   for(Integer i:L2)
   {
     res1.add(1);
   }
   System.out.println(res1);

    
  }


}
 





























