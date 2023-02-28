// Write a Java program to get the character at the given index within the String.

import java.util.Scanner;
class characters
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println(" Give the data to string ");
      s=sc.nextLine();
      System.out.println(" Enter the index num: ");
      int i=sc.nextInt();
      System.out.println("the character of"+i+"is" +s.charAt(i));
    }
  }