import java.util.Scanner;

class ConstructorExample
  {
    int a;
    static double b;
    ConstructorExample(int a1,double b1)
    {
      a = a1;
      b = b1;
    }
    void getdetails()
    {
      System.out.println(a);
      System.out.println(b);
      
    }
  }
class main
  {
    public static void main(String arg[])
    {
      ConstructorExample ce=new ConstructorExample(10,20.4);
      s.getdetails();
    }
  }

