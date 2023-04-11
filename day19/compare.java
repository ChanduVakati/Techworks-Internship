
import java.util.Scanner;

class AliceBob
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter text cases ");
        int t=sc.nextInt();
      
         while(t!=0)
           {
           System.out.println("Enter first person height");
          int x=sc.nextInt();
           System.out.println("Enter second person height");
          int y=sc.nextInt();
             
          if(x>y)
            System.out.println("A");
          else{
            System.out.println("B");
          }
    }
  }
}