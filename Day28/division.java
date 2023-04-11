class program
  {
    public static int main(String arg[])
    {
      System.out.println(" Program execution start ");
      int num1 = 9;
      int num2 = 0;
      int result = 0;

      try
        {
          result = num1/num2;
        }
      catch(ArthmeticException ae)
        {
        System.out.println(ae.toString());
          throw ae;
        }

      System.out.println(" output is: " +result);
      
      System.out.println(" program execution end ");

      return 3;
      System.out.println(" Helllooo ");
    }
  }