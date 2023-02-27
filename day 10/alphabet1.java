import java.util.*;

class alphabet
  {
    public static void main(String args[])
    {
      char c;
      System.out.println("Enter the charecter");
      Scanner sc=new Scanner(System.in);
      c=sc.next().charAt(0);

      if((c>='a' && c<='z')||(c>='A' && c<='Z'))
      {
        System.out.println(c+ " is an Alphabet ");
      }
      else
      { 
        System.out.println(c+ " is not an Alphabet ");
      }
    }
    
  }