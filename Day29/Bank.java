import java.util.*;
class WithdrawException extends Exception
  {
    WithdrawException(String message)
    {
      super(message);
    }
  }

class Bank
  {
    String Customer_Name;
    int balance;
    int withdraw_Amount;
    
    Scanner sc=new Scanner(System.in);
    void ReadName()
    {
      System.out.println(" Enter Customer Name: ");
      try
        {
          Customer_Name=sc.nextLine();
        }
      catch(InputMismatchException ie)
        {
          System.out.println(" Customer Name should have only Alphabets ");
          ReadName();
        }
    }
    
      void ReadBalance()
    {
      System.out.println(" Enter Balnce Amount ");
      try
        {
          balance=sc.nextInt();
        }
      catch(InputMismatchException i)
        {
          System.out.println(" Balance should be an integer format ");
          ReadBalance();
        }
    }

        void ReadWithdraw()
    {
      System.out.println(" Enter Withdraw Amount ");
      try
        {
          withdraw_Amount=sc.nextInt();
        }
      catch(InputMismatchException i)
        {
          System.out.println(" Withdraw amount should be an integer format ");
          ReadWithdraw();
        }
    }

    void Withdraw()
      {
      if((withdraw_Amount>balance) || (withdraw_Amount<0))
        
        try
        {
        throw new WithdrawException(" withdraw Amount should be less than to balance ");
        }
      catch(WithdrawException e)
        {
          System.out.println(e);
        }
      
       else
        {
          balance=balance-withdraw_Amount;
        }
      }
        
      void display()
        {
        System.out.println(" Customer Details ");
        System.out.println(" Customer name " +Customer_Name);
        System.out.println(" Customer Balance " +balance);
        }
  }

    class Main
      {
        public static void main(String arg[])
        {
          System.out.println(" Enter total no.of Bank Customers ");
          Scanner s=new Scanner(System.in);
          int numofcustomers=s.nextInt();
          
          Bank b[]=new Bank[numofcustomers];
          // Array of bank class objects array
          // no object is created
          for(int i=0;i<numofcustomers;i++)
            {
              b[i]=new Bank();
              // create respective object
              // creating customer instance
          b[i].ReadName();
          b[i].ReadBalance();
          b[i].ReadWithdraw();
          b[i].Withdraw();
          b[i].display();
            }
        }
      }