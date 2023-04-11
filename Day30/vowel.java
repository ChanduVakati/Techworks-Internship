// create class WordTest having add()& testWord() to take input and verify whether every word has at least 3 vowels if the word is not having at least 3 vowels then generate a custom exception. Test your code for any 6 different scenarios.
//Use an array of objects for the test cases. 

import java.util.*;

class wordException extends Exception
  {
    wordException(String message)
    {
      super(message);
    }
  }

class WordTest
  {
    String word;

    Scanner sc=new Scanner(System.in);

    void add()
        {
         System.out.println(" Give Data to String ");
          try
            {
              word=sc.nextLine();
            }
            
          catch(InputMismatchException e)
            {
              System.out.println(" String should be only Alphabets ");
            }
        }

      public void testWord()
        {
          String str;
          String arr[]=str.split("");

          int count=0;

          for(int i=0; i<str.length; i++)
            {
              if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                {
                  count++;
                }
              try
                {
                  if(count>=3)
                  {
                    System.out.println(" The word having 3 vowels ");
                  }
                  else
                  {
                    throw new wordException(" Invalid ");
                  }
                }
              catch(wordException we)
                {
                  System.out.println(we);
                }
            }
        }  
  }

class Test
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" Enter How many test cases u want ");

      int p=s.nextInt();
      WordTest[] wt=new WordTest[p];

      for(int i=0; i<p; i++)
        {
          wt[i]=new WordTest();
          wt[i].add();
          wt[i].testWord();
        }
    }
  }