import java.util.Scanner;

class operator
  {
     public static void main(String arg[])
    {
      int n1,n2,sum;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any two numbers:");
      System.out.println("Enter first number:");
      n1=sc.nextInt();
      
      System.out.println("Enter second number:");
      n2=sc.nextInt();

      sum=(n1-(-n2));

      System.out.println(" The sum of two numbers is " +sum);
      
    }
  }