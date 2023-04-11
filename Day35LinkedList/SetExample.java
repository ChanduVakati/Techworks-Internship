import java.util.*;
class setExample
  {
    public static void main(String arg[])
    {
      HashSet h=new HashSet();
      h.add('a');
      h.add('b');
      h.add('j');

      Iterator i=h.iterator();
      while(i.hasNext())
        {
          System.out.println(i.next());
        }
    }
  }