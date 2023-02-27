import java.util.Scanner;

class maxof3
  {
    public static void main(String arg[])
    {
      int n1,n2,n3;
      System.out.println("Enter any number:");

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number:");
      n1=sc.nextInt();
      
      System.out.println("Enter second number:");
      n2=sc.nextInt();
      
      System.out.println("Enter third number:");
      n3=sc.nextInt();

      if(n1>=n2 && n1>=n3)
      {
      System.out.println(n1+ "is the maximum number.");
      }
       else if (n2>=n1 && n2>=n3)
      {
      System.out.println(n2+ "is the maximum number.");
      }
      else  
      System.out.println(n3+ "is the maximum number.");
      
    }
  }