// Write a Java program to compare a given string to another string, ignoring case considerations.

import java.util.Scanner;

class equalignore
  {
    public static void main(String arg[])
    {
      String string=new String();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Give the data to string:");
      string=scanner.nextLine();
      String string1=new String();
      System.out.println("Give the data to string1:");
      string1=scanner.nextLine();
      System.out.println(string.equalsIgnoreCase(string1));
    }
  }