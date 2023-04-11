import java.util.*; 

class Map1  
 {
   public static void main(String[] args)
 { 
   Map<integer,String> map=new HashMap<>();
 map.put(1,"Praseem");
 map.put(5,"Aryan"); 
 map.put(2,"Anusheel"); 
 map.put(6,"Ritin");
   
 Set set=map.entrySet();
   
 Iterator itr=set.iterator();
 while(itr.hasNext())
{
Map.Entry entry=(Map.Entry)itr.next(); 
System.out.println(entry.getKey()+" "+entry.getValue());
 }
 }
}