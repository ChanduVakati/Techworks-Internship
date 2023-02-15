import java.util.Scanner;

class grade
  {
    public static void main(String arg[])
    {
      int m1,m2,m3;
       Scanner d= new Scanner(System.in);
  
      System.out.println("Enter the marks of m1:");
      m1=d.nextInt();
      System.out.println("Enter the marks of m2:");
      m2=d.nextInt();
      System.out.println("Enter the marks of m3:");
      m3=d.nextInt();

      float percentage=(m1+m2+m3/300)*100;
      
      System.out.println("percentage"+percentage);
      if(percentage>=90)
      System.out.println("Grade A");
      else if(percentage>=80)
        System.out.println("Grade B");
      else if(percentage>=70)
        System.out.println("Grade C");
      else if(percentage>=60)
        System.out.println("Grade D");
      else if(percentage>=50)
        System.out.println("Grade E");
       else 
        System.out.println("Fail");
    }
  }