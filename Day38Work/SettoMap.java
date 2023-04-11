import java.util.*;

class SetintoMap
  {
    public static void main(String arg[])
    {
      Set<String> s=new HashSet<>();
      s.add(new String(1,"Chandu"));
      s.add(new String(2,"kiran"));
      s.add(new String(3,"sunny"));
      s.add(new String(4,"bunny"));

      HashMap<Integer,String> Hm=new HashMap<>();
      for(String s1 : s)
        {       
        System.out.println(s1);
        }
      System.out.println("Set:" +s);
      System.out.println("Map:" +Hm);
      
    }
  }