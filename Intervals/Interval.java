import java.util.LinkedList;
import java.util.*;
public class Interval{

int start;
int end;
public Interval(int start,int end)
{
this.start=start;
this.end=end;
}
public LinkedList<Interval> InsertInterval(LinkedList<Interval> ll,Interval newInterval) 
{
LinkedList<Interval> result=new LinkedList<Interval>();
//ll.size();
int i=0;
while(i<ll.size() && (ll.get(i).end<newInterval.start))
{
   result.add(ll.get(i));
   i++; 
}
while(i<ll.size() && (ll.get(i).start<=newInterval.end))
{
   newInterval.start=Math.min(ll.get(i).start,newInterval.start);
   newInterval.end=Math.max(ll.get(i).end,newInterval.end);
    i++; 
}
result.add(newInterval);
while(i<ll.size())
{
result.add(ll.get(i));
i++;
}
return result;
}

public static void main(String[] args)
{
Interval I=new Interval(0, 8);
Interval I1=new Interval(5,7);
Interval I2=new Interval(9,11);

LinkedList<Interval> ll=new LinkedList<Interval>();
//LinkedList<Interval> l2=new LinkedList<Interval>();
ll.add(I);
ll.add(I1);
ll.add(I2);
//ll.InsertInterval(ll,new Interval(3,7));
LinkedList<Interval>merge=I.InsertInterval(ll, new Interval(3,7));

for(Interval a:merge)
{
 System.out.println(a.start + " "+ a.end);


}
}



}