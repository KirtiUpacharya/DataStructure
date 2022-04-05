import java.security.Key;
import java.security.KeyStore.Entry;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;
import java.utils.*;
import java.utils.HashMap;

public class Hshmap{

public static void main(String[]args)
{
java.util.HashMap<Integer,Integer> H1=new HashMap<Integer,Integer>();
java.util.HashMap<Integer,Integer> h4=new HashMap<>();
        H1.put(1,21);
        H1.put(2,34);
		H1.put(3,56);
		H1.put(4,78);
        h4.put(1,21);
        h4.put(2,34);
		h4.put(3,56);
		h4.put(5,78);
System.out.println(H1);
System.out.println(H1.get(2));
Scanner sc=new Scanner(System.in);
 H2.remove(2);
Iterator <Integer> it=H1.keySet().iterator();
while(it.hasNext())
{
    Integer Value=H1.get(it.next());
    System.out.println(H1.get(it.next()));
}
if(H1.containsKey(1))
{
    System.out.println(H1.get(1); 
}
Iterator<Entry<Integer,Integer>> it=H1.entrySet().iterator();

while(it.hasNext())
{
    Entry<Integer,Integer> entry=it.next();
    Integer Key=entry.getKey();
    Integer Val=entry.getValue();
}
 H1.forEach((k,v)->System.out.println(Key , Val));
 HashSet<Integer> comb1=new HashSet<Integer>(H1.keySet());
 comb1.addAll(H1.keySet());
 System.out.println(comb1);
 comb1.removeAll(h4.keySet());
 System.out.println(comb1);
 comb1.removeAll(H1.keySet());
 System.out.println(h4);
//Compare by Value or Key
System.out.println(new ArrayList<>(H1.values()).equals(new ArrayList<>(h4.values())));
System.out.println(new HashSet<>(H1.values().equals(new HashSet<>(h4.values()))));
//Ways to define a hashmap
HashMap<String,Integer> k1=new HashMap<>();
Map<String,Integer> k2=new HashMap<>();
//Static HashMap
public class HashMapInit
{
public static Map<Integer,Integer> k3;
static
{
  k3=new HashMap<>();
  k3.put(2,56);
  k3.put(3,22);
}
HashMapInit.k3.get(2);
}
////only one element immutable map
Map<String,Integer> k4=collections.singleton("First",100);
k4.get("First");

///Creating a 2D Array using stream.

Map<String,Integer> K5=Stream.of(new String [][]){
 {"Name","Kirti"},
 {"ID",:"Kupa"}   
}collect.(collecros.tomap(data->data[0],data->data[1]));

//Mutable map
Map<String,String> K6=stream.of(new AbstractMap.SimpleEntry<>("Name","Kirti"), 
new AbstractMap.SimpleEntry<>("Name1","Pratik").collect(Collectors.toMap(Map.entry::getkey,Map.entry::getvalue))
///Creating a empty Map
Map<Integer,Integer> emptyMap=map.of();
Map<String,String> singletonMap=map.of("Name","Kirti");
Map<String,String> multiMap=map.of(1,23,3,45,5,67);

//Map Entries
Map<Integer,Integer> K=map.ofEntries(new AbstractMap.SimpleEntry<>(1,23),
new AbstractMap.SimpleEntry<>());
//IMMutable Map entry
Map<Integer,Integer> KP=ImmutableMap.of(1,34,4,56,6,78);
}
}