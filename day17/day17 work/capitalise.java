// Write a program to capitalize every word of given string

import java.util.Scanner;

class capitals
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println(" Give data to string ");
      s=sc.nextLine();
      System.out.println(s.toUpperCase());
      
    }
  }