// String Replacer: Create an application that takes a string and a word as input and replaces all occurrences of the word with another word. Use strings to manipulate the input string.

import java.util.Scanner;

class replacestring
  {
    public static void main(String arg[])
    {
      String str1=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter string 1: ");
      str1=sc.nextLine();
      
      int p=stringreplace(str1);
      System.out.println(p+" Replaced String: ");
      
    }
    
    static int stringreplace(String s)
    {
      String word=new String();
      Scanner d=new Scanner(System.in);
      System.out.println("Enter word you want to replace");
      word=d.next();
      
      String word1=new String(); 
      System.out.println("Enter word you want to replace with");
      word1=d.next();
      
      for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)!=' ')
          {
            if(s.equals("word"))
            {
            String q=s.replace(word,word1);
            }
            else
            {
              System.out.println(word1+ " can't find in given string ");
            }
          }
        }
      return 0;
    }
  }