// Data validator: Create a menu based application that can display list of options:
                
/* --> Username and password Verifier: Create a method that takes an username and password as input and verifies these are following basic rules                      
         (having 1 uppercase, lowercase, 1 digit, 1 special character etc....) */

        /* --> Mobile number Verifier: Create a method that  takes a mobile number as input and verifies it contains only digits or not, length should be 10                      digits, starts with 6 or 7 or 8 or 9. */

import java.util.Scanner;

class main
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println(" Give data to string: ");
      s=sc.nextLine();
      
      System.out.println(" Menu Based as ");
      System.out.println(" 1.Username Verifier ");
      System.out.println(" 2.Password Verifier ");
      System.out.println(" 3.Mobile Number Verifier ");
      System.out.println(" Which option do you want verify: ");
      int option=sc.nextInt();
     
        switch(option)
          {
            case 1:UsernameVerifier(s);
              break;
            case 2:PasswordVerifier(s);
              break;
            case 3:MobileNumberVerifier(s);
              break;
          }
      }
    static void UsernameVerifier(String str)
    {
      if(str.length()==8)
      {
        System.out.println(" Invalid Username ");
      }
      else
      {
        int count=0;

        for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)>='A' && str.charAt(i)>='Z')
            {
              count++;
              break;
            }
          }
        for(int j=0;j<str.length();j++)
          {
            if(str.charAt(j)>='a' && str.charAt(j)>='z')
            {
              count++;
              break;
            }
          }
        for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)>='0' && str.charAt(i)>='9')
            {
              count++;
              break;
            }
          }
        for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)=='@' || str.charAt(i)=='$'|| str.charAt(i)=='#')
            {
              count++;
              break;
            }
          }
        if(count==4)
          System.out.println(" Valid Username ");
        else
        System.out.println(" Invalid Username ");
      }
    }

    static void PasswordVerifier(String str1)
    {
      if(str1.length()<6)
        System.out.println(" Invalid Password ");
       
      else
      {
        int count=0;

        for(int i=0;i<str1.length();i++)
          {
            if(str1.charAt(i)>='A' && str1.charAt(i)>='Z')
            {
              count++;
              break;
            }
          }
        for(int j=0;j<str1.length();j++)
          {
            if(str1.charAt(j)>='a' && str1.charAt(j)>='z')
            {
              count++;
              break;
            }
          }
        for(int i=0;i<str1.length();i++)
          {
            if(str1.charAt(i)>='0' && str1.charAt(i)>='9')
            {
              count++;
              break;
            }
          }
        for(int i=0;i<str1.length();i++)
          {
            if(str1.charAt(i)=='@' || str1.charAt(i)=='^'|| str1.charAt(i)=='_')
            {
              count++;
              break;
            }
          }
        if(count>=4)
          System.out.println(" Valid Password ");
        else
        System.out.println(" Invalid Password ");
     }
      
    }
    
    static void MobileNumberVerifier(String str2)
    {
      int count=0;
      for(int i=0; i<=str2.length()-1; i++)
        {
          if(str2.charAt(i)>='0' && str2.charAt(i)<='9')
          {
            count++; 
          }
          else 
          {
             System.out.println(" it is a invalid mobile number ");
          }
        }
      if(count==10)
        System.out.println(" Valid mobile Number ");
      else
        System.out.println(" Invalid mobile number ");
    }
    
  }