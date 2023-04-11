import java.util.*;

class SetToList
  {
    public static void main(String arg[])
    {
      Set s=new HashSet();
      s.add(80);
      s.add(2000);
      s.add("Chandu");
      s.add("kiran");

      List l=new ArrayList(s);
      Iterator i=l.iterator();
      while(i.hasNext())
        System.out.println(i.next());
    }
  }