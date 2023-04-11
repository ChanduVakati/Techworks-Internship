class ClassExample
  {
    int var1=10; // instance variable
    static int var2=30; // static variable
    void displayone()
    {
      int var3=100; // local variable
      System.out.println(var1+"    "+var2+" "+var3);
    }
    void inc()
    {
      var1=var1+1;
      var2=var2+1;
    }
  }
class MainClass
  {
    public static void main(String arg[])
    {
      ClassExample ce=new ClassExample();
      ClassExample c=new ClassExample();
      // System.out.println(ce.var1+"   "+ce.var2+" "+ce.var3);
      ce.inc();
      c.inc();
      ce.displayone();
      c.displayone();
    }
  }

  