import java.util.Scanner;

class Divisibleby5and11
  {
    public static void main(String arg[])
    {
      int num;
      Scanner d = new Scanner(System.in);
      System.out.println("Enter any value:");
      num = d.nextInt();
      if (num%5==0 && num%11==0);
      {
        System.out.println(num+"given num is divisible by 5 and 11");
      }
      else
      {
        System.out.println(num+"given num is not divisible by 5 and 11");
        }
    } 
  }
  