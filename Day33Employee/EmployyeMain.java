import java.util.*;
class EmployeeMain
  {
    public static void main(String a[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      EmployeeImp empobj=new EmployeeImp();
      System.out.println("1. Add Employee Details");
      System.out.println("2. Delete Employee Details");
      System.out.println("3. Search Employee Details");
      System.out.println("4. Display Employee Details");
      do
        {
          System.out.println("Enter your choice: ");
          choice=sc.nextInt();
          switch(choice)
            {
              case 1: empobj.insert();
                break;
              case 2: empobj.delete(); 
                break;
              case 3: empobj.search();
                break;
              case 4: empobj.display();
                break;
              default: System.out.println(" Invalid Option!");
            }
          System.out.println("Do you want to continue one more operation");
          ch=sc.next().charAt(0);
        }
        while(ch!='n');
    }
  }