import java.util.Scanner;

class number
  {
     public static void main(String arg[])
    {
      int n;
      System.out.println(" enter n value: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();

       System.out.println(" reverse numbers are: ");

      while(n>=1)
        {
          System.out.println(n);
          n=n-1;
        }
    }
  }