import java.util.Scanner;

class sum_of_even_numbers
  {
     public static void main(String arg[])
    {
      int n=1,p=0;
      System.out.println(" enter any number: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      p=sc.nextInt();

      while( n>=1 && n<=100)
        {
          if(n%2==0);
          {
            p=p+n;
            n=n+2;
          }
          System.out.println(p);
        }
    }
  }