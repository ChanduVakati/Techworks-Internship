// ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.

import java.util.Scanner;

class Account
  {
    long AccNum;
    double Balance;
    String AccHolderName;

    ConstructorExample(long n1,double n2,String n3)
    {
      AccNum = n1;
      Balance = n2;
      AccHolderName = n3;
      
    }
  void getdetails()
    {
      System.out.println(" Enter Account Details: ");
      Scanner sc=new Scanner(System.in);

      System.out.println(" Enter Account Number: ");
      AccNum=sc.nextLong();

      System.out.println(" Enter Account Balance: ");
      Balance=sc.nextDouble();

      System.out.println(" Enter Account Holder Name: ");
      AccHolderName=sc.nextLine();
      
    }
void deposit()
  {
   Scanner s=new Scanner(System.in);
    System.out.println(" Enter amount u want to deposit: ");
    double amount=s.nextDouble();
    Balance=Balance+amount;
    
  }
void withdraw()
  {
  Scanner s1=new Scanner(System.in);
    System.out.println(" Enter Amount u want to withdraw: ");
    double WithdrawAmount=s1.nextDouble();
    Balance=Balance-WithdrawAmount;
    
  }
void CheckBalance()
  {
  System.out.println(" Your Remaining Balance is: " +Balance);
  }
}

class AtmSimulator
  {
    public static void main(String arg[])
    {
      Account A=new Account();
        A.deposit();
        A.withdraw();
        A. CheckBalance();
    }
  }