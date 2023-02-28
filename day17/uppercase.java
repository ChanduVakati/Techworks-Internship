// Write a Java program to convert all the characters in a string to uppercase.

import java.util.Scanner;

class characters
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to string");
      s=sc.nextLine();
      
      System.out.println(s.toUpperCase());
    }
  }