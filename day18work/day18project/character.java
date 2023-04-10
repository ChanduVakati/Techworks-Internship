//
import java.util.*;

class Encription
  {
    public static void main(String arg[])
    {
      String string=new String();
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("Read some text to encript");
      string=scanner.nextLine();
      
      System.out.println("Read position num to encript character");
      int position = scanner.nextInt();
      
      String r= Encription(string,position);
      System.out.println(" message before encription "+string);
      System.out.println(" message after encription "+r);

      String d=Decription(r,position);
      System.out.println("message after Decription"+d);
    }

  public static String Encription(String s, int p)
    {
      String result="";
      for(int i=0;i<s.length();i++)
        {
          result=result+(char)(s.charAt(i) + p % 26);
        }
      return result;
    }

  public static String Decription(String s1,int q)
    {
      String res="";
      for(int j=0;j<s1.length();j++)
        {
          res=res+(char)(s1.charAt(j) - q % 26);
        }
      return res;
    }
  }