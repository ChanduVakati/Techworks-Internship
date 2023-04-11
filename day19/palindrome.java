// Write a java program to replace every palindrome with “palindrome” in the given text

import java.util.*;

class palindrome
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc= new Scanner(System.in);
      System.out.print(" Enter string you want to check: ");
      s=sc.next();

      String s1[]=s.split(" ");
      
      for(int i=0; i<s1.length; i++)
        {
          boolean f=palindrome(s1[i]);
          if(f==true)
            s1[i]="palindrome";
            
        }
      String result="";
      for(int i=0;i<s1.length;i++)
        result=result+" "+s1[i];

          String result=new String(s1);
      {
        static boolean palindrome(String s2)
          {
          for(int j<s2.length()-1;j=0;j--)
          {
          String s3="";
          s3=s3+s.charAt(j);
          }
        if(s3==s)
        {
          return true;
        }
        else
        {
          return false;
        }
          }
      }
      
    }
  }
