import java.util.*;
class LinkedList
  {
    public static void main(String arg[])
    {
      LinkedList l=new LinkedList<>();
  
      l.add("Chandu");
      l.add(21);
      l.add("chandu");
      System.out.println(l);

      Enumeration r=l.element();
      while(r.hasMoreElements())
      {
        System.out.println(r.nextElement());
      }

      Iterator x=l.iterator();  
      while(x.hasNext())
        { 
        System.out.println(x.next());
        }
 
        ListIterator n=l.listIterator();
        while(n.hasNext())
          {
          System.out.println(n.next());
          }
    }
  }