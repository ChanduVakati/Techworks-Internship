class Threadclass implements Runnable
  {
    public void run()
    {
      System.out.println("iam running thread");
    }
  }
public class RunnableThread
  {
    public static void main(String h[])
    
    {
      Threadclass tc=new Threadclass();
      //tc.run();
      Thread t=new Thread(tc);
      t.start();
      
    }
  }