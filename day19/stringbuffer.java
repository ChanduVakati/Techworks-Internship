import java.util.*;

class methods
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Enter data to string ");
      
      StringBuffer sb=new StringBuffer(s);
      sb.append("hero");
      System.out.println(sb);

      sb.insert(2,"hero");
      System.out.println(sb);
      
      sb.replace(2,3,"hero");
      System.out.println(sb);

      sb.delete(1,3);
      System.out.println(sb);

      sb.reverse();
      System.out.println(sb);
    }
    
  }