import java.util.*;

class alternate
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Give data to string ");
      s=sc.nextLine();

      char[] result = new char[2];
      StringBuilder remaining = new StringBuilder();

     for(int i=0;i<s.length();i++)
       {
         if(i%2==0)
         {
           result[0]+=s.charAt(i);
         }
         else
         {
           remaining.append(s.charAt(i));
         }
       }
      result[1] = remaining.toString().toCharArray()[0];
      
      System.out.println(result[0]+" ");
      System.out.println(remaining.toString()+" ");
   }
  
  }