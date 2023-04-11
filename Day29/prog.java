import java.util.*;
 
    class Main
    {  
      int balance;
      String CustomerName;
      
      void read()   
      {
        
    Scanner s=new Scanner(System.in);
        
    System.out.println("Enter Custome Name");
        try
          {
    CustomerName=s.nextLine();
            
          }
        catch(Exception e1)
          {
            System.out.println("Please enter string data");
            read();
          }
    System.out.println("Enter balance amount");
        try
          {
   balance=s.nextInt();
          }
        catch(Exception e)
          {
            System.out.println("Please enter integer data");
            read();
          }
    System.out.println(CustomerName+"  "+balance);
      }
        
     public static void main(String a[])
    {
    Main m=new Main();
    m.read();
    }
  }