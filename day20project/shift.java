// Shifting string: shft content of string with n position

import java.util.Scanner;

class shifter
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Give data to string: ");
      s=sc.nextLine();

      System.out.println(" enter positions ");
      int n=sc.nextInt();
      
      System.out.println(" which shift operator do you want: ");
      System.out.println(" 1.Right shift ");
      System.out.println(" 2.Left shift ");
      int option=sc.nextInt();

      switch(option)
        {
          case 1:
            String s1= RightShift(s,n);
            System.out.println(s1);
            break;
          case 2:
            String s2= LeftShift(s,n);
            System.out.println(s2);
            break;
        }  
    }
    
    static String RightShift(String str,int n1)
    {
      
      char stringarray[]=str.toCharArray();
      for(int i=1;i<=n1;i++)
        {
          char temp=stringarray[stringarray.length-1];
          for(int j=0;j<stringarray.length-1;j++)
            {
              stringarray[j+1]=stringarray[j];
            }
          stringarray[0]=temp;
        }
        String s=new String(stringarray);
       return s;
    }

    static String LeftShift(String str1,int n2)
    {
      char stringarray[]=str1.toCharArray();
      for(int k=1;k<=n2;k++)
        {
          char temp=stringarray[0];
          for(int l=stringarray.length-1;l>=0;l--)
            {
              stringarray[l-1]=stringarray[l];
            }
           stringarray[0]=temp;
        }
      String s=new String(stringarray);
      return s;
    }
  }