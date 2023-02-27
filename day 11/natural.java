import java.util.Scanner;

class number
  {
    public static void main(String arg[])
    {
      int n;
      int i=1;
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter value n: ");
      n=sc.nextInt();

      System.out.println("numbers are:");

      while(i<=n)
        {
          System.out.println(i);
          i++;
        }
      
    }
  }