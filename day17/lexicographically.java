// Write a Java program to compare two strings lexicographically

import java.util.Scanner;

class compare
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
      System.out.println(string.compareTo(string1));
    }
  }