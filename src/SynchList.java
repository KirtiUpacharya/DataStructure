import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchList
{
  List<String> namelist=Collections.SynchronizedList(new ArrayList<String>()); 
  namelist.add("Kirti");
  namelist.add("Pratik");
  //To Fetch or Traverse the data we need to synchronize it.
  synchronized(namelist)
  {
      Iterator<String> it=namelist.iterator();
      While(it.hasNext())
      {
          System.out.println(it.next());
      }
  }
CopyOnWriteArrayList <String> namelis1=new CopyOnWriteArrayList<String>();
 namelis1.add("Hello");
 namelis1.add("World");
 Iterator<String> it = namelis1.iterator();
 While(it.hasNext())
 {
     System.out.println(it.next());
 }

}
