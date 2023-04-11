// ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.

import java.util.*;

class WithdrawException extends Exception
  {
    WithdrawException(String message)
    {
      super(message);
    }
  }

class Account
  {
    long AccNum;
    double Balance;
    String AccHolderName;

    Scanner sc=new Scanner(System.in);
    void ReadNumber()
    {
      System.out.println(" Enter Account Number: ");
      try
        {
          AccNum = sc.nextLong();
        }
      catch(InputMismatchException e)
        {
        System.out.println(" Enter only integer value ");
          ReadNumber();
        }
    }

    void ReadBalance()
    {
      System.out.println(" Enter Balance Amount ");
      try
        {
        Balance = sc.nextDouble();
        }
      catch(InputMismatchException e1)
        {
          System.out.println(" Balance should be an integer value only ");
          ReadBalance();
        }
    }

     void ReadName()
    {
      System.out.println(" Enter Account Holder Name: ");
      try
        {
          AccHolderName=sc.nextLine();
        }
      catch(InputMismatchException ie)
        {
          System.out.println(" Account Holder Name should have only Alphabets ");
          ReadName();
        }
    }

     void Withdraw()
      {
      if((withdraw_Amount>Balance) || (withdraw_Amount<0))
        
        try
        {
        throw new WithdrawException(" withdraw Amount should be less than to balance ");
        }
      catch(WithdrawException e2)
        {
          System.out.println(e2);
        }
      
       else
        {
          Balance=Balance-withdraw_Amount;
        }
      }

    void deposit()
    {
      if(Amount==0)

        try
          {
            throw new depositException(" Deposit Ammount should be not equals to zero ");
            
          }
      catch(depositException e3)
          {
            System.out.println(e3);
          }

      else
      {
        Balance=Balance+Amount;
      }
    }

   void display()
    {
        System.out.println(" Account Details ");
        System.out.println(" Account Holder name " +AccHolderName);
        System.out.println(" Account Balance " +Balance);
    }
  }

class ATM_Simulator
      {
        public static void main(String arg[])
        {
          System.out.println(" Enter total no.of Accounts ");
          Scanner s=new Scanner(System.in);
          int numofAccounts=s.nextInt();
          
          Account b[]=new Account[numofAccounts];
          
          for(int i=0;i<numofAccounts;i++)
            {
              b[i]=new Account();
              
          b[i].ReadNumber();
          b[i].ReadBalance();
          b[i].ReadName();
          b[i].Withdraw();
          b[i].deposit();
          b[i].display();
            }
        }
      }
