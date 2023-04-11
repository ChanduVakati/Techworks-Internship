//Bank Account: Create a class called BankAccount that has properties such as account number, balance, and account holder name. Create subclasses such as CheckingAccount, SavingAccount and CreditAccount that inherit from BankAccount and add additional properties such as interest rate or credit limit. Create methods to deposit and withdraw money, check the balance and return the account details in the parent class, and override them in the subclasses to implement specific behavior for each account type.

import java.util.Scanner;

class BankAccount
  {
    long Acc_Num;
    double Balance;
    String Acc_Holder_Name;
    
  
    Consructor(long l, double a, String s)
    {
      Acc_Num = l;
      Balance = a;
      Acc_Holder_Name = s;
      
    }
    
  }