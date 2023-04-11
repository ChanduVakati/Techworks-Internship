import java.util.*;

class ListToSet
  {
    public static void main(String arg[])
    {
      List<String> list=new ArrayList<>();
      list.add("balu");
      list.add("alladi");
      list.add("abc");
      Set<String> s1=new HashSet(list);
      for(String s2:s1)
        {
          System.out.println(s2);
        }

    }
  }