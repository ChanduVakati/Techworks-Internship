// Text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common word.

import java.util.Scanner;

class textanalyser
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println(" Text any sentence: ");
      s=sc.nextLine();
      
      int p=character(s);
      System.out.println(p+" no.of characters ");

      int q=word(s);
      System.out.println(q+" no.of wors ");
      
      int r=lines(s);
      System.out.println(r+" no.of lines ");
    }
    
    static int character(String a)
    {
     int count=0;
      for ( int i=0; i<a.length();i++)
        {
          char ch=a.charAt(i);
          if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
          {
            count=count+1;
          } 
        }
      return count;
    }
    
    static int word(String b)
    {
      int word_count=0;
      String arr[]=b.split(" ");
      for(int i=0; i<b.length(); i++)
        {   
           word_count=word_count+1; 
        }
      return word_count;
    }
    
    static int lines(String c)
    {
      int line_count=0;
      for(int j=0;j<c.length();j++)
        {
          char ch=c.charAt(j);
          if(ch.equals(" "))
            {
            line_count=line_count+1;
            }
        }
     return line_count;
    }
  }