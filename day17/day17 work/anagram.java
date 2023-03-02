//  Write a java program to check if two given String is the anagram of each other

import java.util.Scanner;

class Anagram
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter first string: ");
      String s1=new String(sc.nextLine());
      System.out.println(" Enter second string: ");
      String s2=new String(sc.nextLine());

      int c1=-1;
      if(s1.length()!=s2.length())
        System.out.println(" Given strings are not anagrams ");
      else
      {

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        for(int i=0; i<ch1.length; i++)
          {
            for(int j=i+1; j<ch1.length; j++)
              {
                char c;
                if (ch1[i]>ch1[j])
                {
                  c=ch1[i];
                  ch1[i]=ch1[j];
                  ch1[j]=c;
                }
              }
          }
        for(int i=0;i<ch2.length;i++)
          {
            for(int j=0;j<ch2.length;j++)
              {
                char c;
                if(ch2[i]>ch2[j])
                {
                  c=ch2[i];
                  ch2[i]=ch2[j];
                  ch2[j]=c;
                }
              }
          }
        for(int i=0;i<ch1.length;i++)
          {
            if(ch1[i]!=ch2[i])
            {
              c1=0;
              break;
            }
            else continue;
          }
      }
      if(c1==0)
        System.out.println(" Given strings are not anagrams ");
      else
        System.out.println(" Given strings are anagrams ");
    }
  }