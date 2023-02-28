// Write a Java program to get the index of a pattern in the given string.

import java.util.Scanner;

class pattern
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to string");
      s=sc.nextLine();
       System.out.println("Enter the index num:");
      String i=sc.nextLine();
      System.out.println(s.indexOf(i));
      
    }
  }