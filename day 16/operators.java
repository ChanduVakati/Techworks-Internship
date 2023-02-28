import java.util.Scanner;

class operators
  {
    public static void main(String args[])
    {
      int a=5;
      int b=7;
      System.out.println("Addition of a&b");
      int p=addition(a,b);
      System.out.println(p);
      
      System.out.println("Substraction of a&b");
      int s=substraction();
      
      System.out.println("multiplication of a&b");
      multiplication(a,b);
      System.out.println("division of a&b");
      divison();
      }

static int addition(int x,int y)
{
 return (x+y);
}
 int subtraction()
{
 int m=3,n=7;
 return(m-n);
}
 void multiplication(int x1,int y1)
{
 int p=(x1*y1);
 System.out.println(p);
}
 void Divison()
{
  double x=8.8;
  double y=5.7;
  double z=(x/y);
 System.out.println(z);
}
}