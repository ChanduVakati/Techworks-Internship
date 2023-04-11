class Threadclass extends Thread
  {
    public void run()
    {
      System.out.println(" iam running thread");
    }
  }
public class Multithread
  {
    public static void main(String h[])
    
    {
      Threadclass tc=new Threadclass();
      tc.start();
    }
  }