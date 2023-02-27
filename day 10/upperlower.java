import java.util.Scanner;

class uppercase_lowercase {
  public static void main(String arg[]) {
    char ch;
    System.out.println("Enter any charecter:");
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);

    if (ch >= 'A' && ch <= 'Z')
      System.out.println(ch + " is upper case ");
    else
      System.out.println(ch + " is lower case ");

  }
}