class program1
  {
    static int x=10;
    int y=20;
    
    
    void displayone()
    {
    System.out.println(x+" "+y);
    }
    
    static void inc()
      {
       x=x+1;
      System.out.println(x);
      }
    
    void dec()
      {
      x=x-1;
      y=y-1;
      System.out.println(x+" "+y);
      }
      
    }
  
    class program
      {
        public static void main(String arg[])
        {
          ClassExample ce=new ClassExample();
          ce.displayone();
        }
      }
    