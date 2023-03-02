// Find length of each word in given input string.

import java.util.Scanner;

class words
{
    public static void main(String args[])
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Give data to string");
        str=sc.nextLine();

      System.out.println("No of words : " + countWords(str));
    }
  
  public static int countWords(String str)
    {
        if (str == null || str.isEmpty())
          
            return 0;
    }
        String[] words = str.split("\\s+");
    
        return words.length;  
}