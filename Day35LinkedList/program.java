import java.util.*;
class Main
  {
    public static void main(String arg[])
    {
      LinkedList L=new LinkedList();
      L.add("Chandu");
      L.add(23);
      L.add("Vijayawada");
      L.add(45,"a");
      System.out.println(L);

      L.getFirst();
      L.removeFirst();

      LinkedList<Integer> l=new LinkedList<>();
      l.add(45);
      l.add(98);
      System.out.println(l);

      l.addFirst(56);
      l.removeFirst();

      LinkedList<Object> o=new LinkedList<>();
      o.add("chandu");
      o.add(4,2002);
      o.add("july");
      System.out.println(o);
    }
  }