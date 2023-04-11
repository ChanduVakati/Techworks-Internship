import java.util.*;
class Main
  {
    int z;
    Scanner s=new Scanner(System.in);
    
    void read()
    {
    try
      {
    z=s.nextInt();
    }
    catch(Exception e)
      {
        System.out.println("enetr valid data");
        read();
      }
    }
    void show()
      {
      System.out.println(z);
      }
  
  public static void main(String l[])
    {
    Main m=new Main();
    m.read();
    m.show();
    }
  }