// Check whether the given mobile number is valid or not.

import java.util.*;

class mobile
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Enter mobile number: ");
      s=sc.nextLine();

      int p=mobilenumber(s);
     if(p==10)
       System.out.println(" valid mobile number ");
      else
       System.out.println(" invalid ");
      
    }

    public static int mobilenumber(String str)
    {
      int count=0;
      for(int i=0; i<=str.length()-1; i++)
        {
          if(str.charAt(i)>='0' && str.charAt(i)<='9')
          {
            count++;
          }
          else 
          {
             System.out.println(" it is a invalid mobile number ");
          }
        
        }
      return count;
    
    }
  }