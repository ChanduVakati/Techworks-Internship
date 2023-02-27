import java.util.Scanner;

class oddnumber
  {
      public static void main(String args[])
    {
      int n;
      System.out.println("enter limit");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();

      while(n>=0 && n<=100);
      {
        if(n%2!=0);
        System.out.println(n);
        n=n+1;
      }
      
    }
  }