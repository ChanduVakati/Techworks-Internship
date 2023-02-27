import java.util.Scanner;

class maxof2
  {
    public static void main(String arg[])
    {
      int num1,num2;
      System.out.println("Enter any two numbers:");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number:");
      num1=sc.nextInt();
      
      System.out.println("Enter second number:");
      num2=sc.nextInt();

      if(num1>num2)
        System.out.println(num1+ "is greater than" +num2);
      else
        System.out.println(num2+ "is greater than" +num1);
    }
  }