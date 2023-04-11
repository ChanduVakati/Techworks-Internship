import java.util.*;

class Stack
  {
    public static void main(String arg[])
    {
      Stack<Integer> s=new Stack<Integer>();

      s.push(86);
      s.push(465);
      s.push(34);
      s.push(12);
      s.push(2);
      s.pop();
      s.pop();
      System.out.println("Stack:" +s);
      
    }
  }