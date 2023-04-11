// create a class EvenArray having  add() and testEven() methods to take input and verify whether each array element is even or not, if the element is not an even number generate a custom exception, Test your code for any 4 different cases. Use an array of objects for the test cases.
import java.util.*;

class notevenException extends Exception
  {
    notevenException(String message)
    {
      super(message);
    }
  }
class EvenArray
  {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[5];
    int[] temp = new int[5];
    
    void Read()
    {
      System.out.println(" Enter the array of elements ");
       
      try
        {
        for(int i=0;i<num.length;i++)
          num[i] = sc.nextInt();
         }
      catch(InputMismatchException e)
        {
        System.out.println(" Enter only integer type of values ");
        Read();
      }
    }
  
    void sum()
    {
      int count = 0;
      for(int i=0; i<num.length; i++)
      {
        count=count+num[i];
      }
      System.out.println(" sum of array is: " + count);
    }
    
    void CheckingNum() 
    {
       temp = new int[num.length];
      System.out.println(" Even numbers are: ");
      try
        {
        for(int i=0;i<num.length;i++)
        {
          if(num[i]%2==0)
          {
            System.out.println(num[i] + " ");
          }
        }
      }
      catch(Exception e)
        {
          System.out.println(" This is negative number " + e.getMessage());
        }
    }
    
  }

public class Array
  {
    public static void main(String[] args) 
    {
      EvenArray[] ea = new EvenArray[4];
      for(int i=0;i<4;i++)
        {
        ea[i] = new EvenArray();
          
        ea[i].Read();
        ea[i].sum();
        ea[i].CheckingNum();
        
      }
    }
  }