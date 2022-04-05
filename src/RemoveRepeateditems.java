import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveRepeateditems
{
  public void RemoveRepeateditems()
 {
   ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7,8,9,4,3));
   LinkedHashSet<Integer> distnumbers=new LinkedHashSet<Integer>(numbers);
   ArrayList<Integer> Res=new ArrayList<Integer>(distnumbers);
   ArrayList<Integer> Clonelist=new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7));
   Clonelist.clone(numbers);
   System.out.println(Clonelist);  
   //
   ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,9,9,8,7,5,6));
   List<Integer> marklistUnique= numbers1.stream().distinct().collect(Collectors.toList());
   System.out.println(marklistUnique);
   ///
   ArrayList<Integer> nm=ArrayList<Integer>(Arrays.asList(23,56,34,56,67));
   List<Integer> n= nm.stream().distinct().collect.(Collectors.toList());
   List<Integer> m=n.stream().distinct().collect.(Collectors.toList());
   List<Integer> p= n.stream().distinct().collect.(Collectors.toList());
   LinkedHashSet<Integer> o=new LinkedHashSet<Integer>(p);
 }

}