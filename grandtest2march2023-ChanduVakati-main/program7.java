import java.util.Scanner;

class braveauthor
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Give data to string ");
      s=sc.nextLine();

      display(s);
      
    }
    public static void display(String str)
    {
      int arr[]=new int[256];

      for(int i=0;i<=str.length()-1;i++)
        {
          char c=str.charAt(i);
          arr[c]=arr[c]+1;
        }
      int a=0,b=0;

      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]>1)
            a=arr[i];
          else if(arr[i]==1)
            b=b+arr[i];
        }
      if(a==b)
        System.out.println("YES");
      else 
        System.out.println("NO");
    }
  }