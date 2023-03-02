// Find number of Upper case and lower case letters are there in given string.

import java.util.Scanner;

class uppercaselowercase
  {
    public static void main(String arg[])
    {
      String str=new String();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Give the data to string");
      str=scanner.nextLine();

      int lower=0, upper=0;
      for(int i = 0; i < str.length(); i++)
        {
          char ch[]=str.charAt(i);
          
          if (ch>='A' && ch<='Z')
                upper++;
          else 
                lower++;
        }
      System.out.println("Lower case letters : " + lower);
      System.out.println("Upper case letters : " + upper);
      
    }
  }