
import java.util.Scanner;

interface vehicle
  {
    String Registration();
    void Services();
    double price();
    void start();
    void stop();
    
  }
class car implements vehicle
  {
    public String Registration()
    {
      Scanner sc=new Scanner(System.in);
       System.out.println(" Enter Details for Registration ");
      String s=sc.nextLine();
      
      return s;
    }
    public void Services()
    {
      System.out.println(" Your car Service is Done ");
    }
    public double price()
    {
      Scanner s1=new Scanner(System.in);
      System.out.println(" Enter price of car ");
      double p=s1.nextDouble();
      
      return p;
    }
    public void start()
    {
      System.out.println(" Starting the Engine ");
    }
    public void stop()
    {
      System.out.println(" Stoping the Engine ");
    }
  }

class CarVehicle
  {
    public static void main(String a[])
    {
      car c=new car();
      c.Registration();
      c.Services();
      c.price();
      c.start();
      c.stop();
    }
  }