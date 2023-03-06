import java.util.Scanner;

class langlearner
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Welcome to Bitlabs! Enter your lanuage ");
      s=sc.nextLine();
      
      String string1="[noun] was really [adjective] today. We learned how to write [activity] today. I can't wait for tomorrow.";
      
      String string2[]=string1.split(" ");
      String string3,string4,string5;
      
      System.out.println(" Give noun to string ");
      string3=sc.nextLine();
      
      System.out.println(" Give adjective to string ");
      string4=sc.nextLine();
      
      System.out.println(" Give activity to string ");
      string5=sc.nextLine();

      string2[0]=string3;
      string2[3]=string4;
      string2[10]=string5;

      for(int i=0;i<string2.length;i++)
        {
          System.out.println(string2[i]+" ");
        }
        
    }
  }