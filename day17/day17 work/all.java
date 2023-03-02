// Find number of vowels, consonants, spaces, digits and special symbols in given input string.

import java.util.Scanner;

class count
  {
    public static void main(String arg[])
    {
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println(" Give data to string ");
      s=sc.nextLine();

      int vowels= 0, consonants= 0,spaces=0, number = 0, special = 0;

        s=s.toUpperCase();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
          
            if(ch == 'A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                consonants++;
            }
            else if(ch >= '0' && ch <= '9')
            {
                number++;
            }
            else if(ch==' ')
            {
              spaces++;
            }
            else 
                special++;
        }
  
        System.out.println("Vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("Number : " + number);
        System.out.println("spaces : " + spaces);
        System.out.println("Special characters : " + special);
    }
    
  }