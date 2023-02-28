// Write a Java program to concatenate a given string to the end of another string.

import java.util.*;

class StringConcatenate
  {
    public static void main(String arg[])
    {
      String string=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println(" Give the data to string ");
      string=sc.nextLine();
      String string1=new String();
      string1=sc.nextLine();
      System.out.println(string.concat(string1));
    }
  }