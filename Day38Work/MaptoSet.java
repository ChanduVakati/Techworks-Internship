import java.util.*;

class MapintoSet
  {
    public static void main(String arg[])
    {
      HashMap<Integer,String> hm=new HashMap<>();

      hm.put(1,"abc");
      hm.put(2,"bcy");
      hm.put(3,"gfy");

      Set<String> s=new HashSet<>(hm);
      for(String s1 : s)
        System.out.println(s1);
    }
  }