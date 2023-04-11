import java.util.Scanner;

class String
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    String s=new String();
    System.out.println(" Give data to string: ");
    s=sc.nextLine();
    
    StringTokenizer st=new StringTokenizer(s);
    
    System.out.println(st.countTokens());

    while(st.hasmoreTokens())
      {
        System.out.println(st.nextToken());
        
      }
    
  }
}