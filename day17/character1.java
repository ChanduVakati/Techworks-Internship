import java.util.Scanner;

class characters
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n;
    n=sc.nextInt();
     String s=new String();
    System.out.println("Read character array: ");
    char c[]=new char[n];
    for(int i=0;i<n;i++)
      c[i]=sc.next().charAt(0);

    for(int j=0; j<c.length; j++)
      {
     String str=new String(c,2,5);
      
     System.out.println(str);
      }
  }
}