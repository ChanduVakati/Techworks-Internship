// Find maximum length and minimum length words in given string 

import java.util.Scanner;

class maxlenminlen
  {
    public static void main(String arg[])
    {
      String string=new String();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Give the data to string");
      string=scanner.nextLine();
  
      int p=maxlenminlen(string);
      System.out.println(p+" ");
      
    }
    static int maxlenminlen(String s)
    {
      String StrArr[]=s.split("");
      String Minword=Maxword=StrArr[0];

      for(int i=1;i<StrArr.length;i++)
        {
          if(Minword.length()>StrArr[i].length())
            Minword=StrArr[i];
          else 
            if(Maxword.length()<StrArr[i].length())
              Maxword=StrArr[i];
              
        }
      System.out.println(Minword);
      System.out.println(Maxword);
      return 0;
    }
  }