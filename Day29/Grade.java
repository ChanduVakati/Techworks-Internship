import java.util.Scanner;

class Main
  {
    char Stu_Grade;
    double Avg;

    void read()
    {
      Scanner sc=new Scanner(System.in);

      System.out.println(" Enter Student Grade: ");

      try
          {
          Stu_Grade=sc.next().charAt(0);
            
          }
        catch(InputMismatchException e)
          {
            System.out.println("Please enter Charecter data");
            read();
          }
      
        System.out.println(" Enter Average ");
        try
          {
          Avg=sc.nextDouble();
          }
        catch(Exception e1)
          {
            System.out.println("Please Enter Double data");
            read();
          }
      
          System.out.println(Stu_Grade+"  "+Avg);
      }
    
    public static void main(String a[])
    {
    Main m=new Main();
    m.read();  
    }
    
  }  