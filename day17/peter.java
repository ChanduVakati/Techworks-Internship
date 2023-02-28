import java.util.Scanner;

class peter
  {
    public static void main(String arg[])
    {
      String string=new String();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Give the data to string");
      string=scanner.nextLine();

      int n1=0,n2=0;
      for(int i=0; i<n-1; i++)
        {
          if(string.charAt(i)=='0')
          {
            n1++;
          }
          else
            n2++; 
        }
      if(n1<n2)
      {
        System.out.println("Win the match");
      }
      else
      {
         System.out.println("losses the match");
      }
    
    }
    
  }