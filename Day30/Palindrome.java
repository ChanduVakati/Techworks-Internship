// Create class Palindrome having methods add() and palindrome() to take data and verify whether the given number is palindrome or not. If the number is not palindrome generate a custom exception. Test your code for any 5 different numbers.
//Use an array of objects for the test cases.

import java.util.*;

class notPalindromeException extends Exception
  {
    notPalindromeException(String message)
    {
      super(message);
    }
  }

class palindrome
  {
    int number;
    
    Scanner s=new Scanner(System.in);

      void ReadData()
        {
          System.out.println(" Enter any number ");
          try
            {
              number=s.nextInt();
            }
          catch(InputMismatchException e)
            {
              System.out.println(" Number should be an integer value ");
            }
        }
    
    void CheckPalindrome()
    {
      
      int r;
      int sum=0;
      int temp=number;
      
      while(number>0)
        {
         r=number%10;       
         sum=(sum*10)+r;    
         number=number/10;  
        }

       if(sum != number)
       {
         try
           {
             throw new notPalindromeException(" Invalid Palindrome ");
           }
         catch(notPalindromeException pe)
           {
             System.out.println(pe);
           }
       }
      else
       {
         System.out.println(number + " is a Palindrome ");
       }
    }
  }

    class Palindrome
      {
        public static void  main(String arg[])
        {
          Scanner sc=new Scanner(System.in);
          System.out.println(" Enter How many Test cases you want: ");
          
          int p=sc.nextInt();
          palindrome pa[]=new palindrome[p];
          
          for(int i=0;i<p;i++)
            {
              pa[i]=new palindrome();
              pa[i].ReadData();
              pa[i].CheckPalindrome();
            }
        }
      }    