import java.util.*;

class LinkToArray
  {
    public static void main(String arg[])
    {
      LinkedList l=new LinkedList();
      l.add(24);
      l.add("String");
      l.add(4);
      l.add(34,'a');

      System.out.println(l);

      List li=new ArrayList(l);
      System.out.println("");
      for(Object i : li)
        System.out.println(i);
    }
  }