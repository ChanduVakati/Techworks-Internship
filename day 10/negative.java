import java.util.*;

class number
  {
     public static void main(String args[])
    {
      float num;
      System.out.println(" enter any number:");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();

      if(num>0)
        System.out.println(num+" is a positive ");
      else if(num<0)
        System.out.println(num+" is a negative ");
       else 
        System.out.println(num+" is zero ");  
    }
  }