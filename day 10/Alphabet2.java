import java.util.Scanner;

class alphabetdigitspecial
  {
    public static void main(String arg[])
    {
      System.out.println("Enter any charecter:");
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      
      if((c>='a' && c<='z')||(c>='A' && c<='Z'))
      {
      System.out.println(c+" is an ALPHABET. ");
      }
      else if( c>='0' && c<='9') 
      {
        System.out.println(c+ " is a DIGIT. ");
      }
      else
      {
        System.out.println(c+" is a SPECIAL CHARECTER. ");
      }
    }  
  }