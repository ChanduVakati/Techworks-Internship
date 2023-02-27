import java.util.Scanner;

class number
  {
    public static void main(String args[])
    {
      int num,d,p=0;
      System.out.println("Enter your mobile number:");
      Scanner s=new Scanner(System.in);
      num=s.nextInt();
      
      d=num/10;
      p=num%10;
      
      while(num>=10)
        {
          System.out.println(" d is" +num );
          System.out.println(" p is " +num );
        }
      
      
    }
  }