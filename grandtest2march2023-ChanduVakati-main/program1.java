// Sophie, a college student, urgently needs cash to buy her textbooks. She heads to the nearest ATM to withdraw money. The ATM allows withdrawal of denominations 500, 200, and 100. However, Sophie needs a specific amount of money and wants to withdraw it with the minimum number of notes. 

//The ATM will only dispense money if the requested amount is a multiple of 100. 

//If Sophie needs to withdraw Rs. 3700 from the ATM, how many minimum notes of denominations 500, 200, and 100 will she get? Can you write a program to calculate the minimum number of notes required to dispense the requested amount? 

import java.util.Scanner;

class main
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;

      while(n>=500)
        {
          n=n-500;
          c++;
        }
      while(n>=200)
        {
          n=n-200;
          c++;
        }
      while(n>=100)
        {
          n=n-100;
          c++;
        }
      System.out.println(c);
    }
  }