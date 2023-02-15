import java.util.Scanner;

class Student {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String name = s.next();
    int id = s.nextInt();
    int mark1, mark2, mark3;
    mark1 = s.nextInt();
    mark2 = s.nextInt();
    mark3 = s.nextInt();
    int avg = mark1 + mark2 + mark3 / 3;
    System.out.println("student num is" + id);
    System.out.println("student name is" + name);
    System.out.println("student avg is" + avg);

  }
}