class ClassExample
  {
    int var1=10;
    private int var2=20;
    void displayone()
    {
      System.out.println(var1+"   "+var2);
    }
  }
class MainClass
  {
  public static void main(String arg[])
    {
      ClassExample ce=new ClassExample();
      ce.displayone();
    }
  }