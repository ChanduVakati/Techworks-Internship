import java.util.Scanner;

class Alphabet
  {
    public static void main(String arg[])
    {
      char a;
      Scanner d= new Scanner(System.in);

      System.out.println("Enter an Aphabet:");
      a=d.next().charAt(0);

      System.out.println("a"+a);
      switch(a)
        {
          case 'a':
          case 'A':
          case 'e':
          case 'E':
          case 'i':
          case 'I':
          case 'o':
          case 'O':
          case 'u':
          case 'U':
            System.out.println(a+" is vowel");
            break;
          default:
            System.out.println(a+" is consonent");
              
        
        }
        
    }
  }