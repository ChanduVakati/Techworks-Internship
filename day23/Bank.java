import java.util.Scanner;

class BankApplication
  {
    String Name;
    String Password;
    String IFSC_CODE;
    
  BankApplication(String n1,String n2)
    {
      Name = n1;
      Password = n2;
    }

void Verify()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println(" Enter Name: ");
  String n = sc.nextLine();

  System.out.println(" Enter Password: ");
  String p = sc.nextLine();

  if(n.equals(Name) && p.equals(Password))
  
      System.out.println(" You are an Authorised User ");
  
  else
  {
    System.out.println(" Invalid ");
  }
}
}

class MainBank
  {
    public static void main(String arg[])
    {
      BankApplication ba=new BankApplication("Chandu","Chandu@789");
      ba.Verify();
      
    }
  }
