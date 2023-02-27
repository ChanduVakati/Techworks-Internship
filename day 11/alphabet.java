import java.util.*;

class alphabets
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println(" charecters are: ");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);

      System.out.println(" charecters are: ");

      while((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
          System.out.println(ch);
        }
    }
  }