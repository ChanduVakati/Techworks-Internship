import java.util.*;

class cal
  {
    public static void main(String arg[])
    {
      char operator;
        float num1,num2,result;

      Scanner d=new Scanner(System.in);

      System.out.println("choose an operator: +,-,*,/ or %");
      operator=d.next().charAt(0);

      System.out.println("Enter first num1:");
      num1=d.nextFloat();

      System.out.println("Enter second num2:");
      num2=d.nextFloat();

      switch (operator) {
        case '+':
            result=num1+num2;
            System.out.println(num1+ "+" +num2+ "=" +result);
            break;

          case '-':
            result=num1-num2;
            System.out.println(num1+ "-" +num2+ "=" +result);
            break;

          case '*':
            result=num1*num2;
            System.out.println(num1+ "*" +num2+ "=" +result);
            break;

          case '/':
            result=num1/num2;
            System.out.println(num1+ "/" +num2+ "=" +result);
            break;

          case '%':
            result=num1%num2;
            System.out.println(num1+ "%" +num2+ "=" +result);
            break;

          default:
            System.out.println("invalid operator");
            break;
      }
    }
  }