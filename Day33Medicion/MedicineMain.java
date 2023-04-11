import java.util.*;
class MedicineMain
  {
    public static void main(String a[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      MedicineImp medobj=new MedicineImp();
      System.out.println("1. Add Medicine Details");
      System.out.println("2. Delete Medicine Details");
      System.out.println("3. Search Medicine Details");
      System.out.println("4. Display Medicine Details");
      do
        {
          System.out.println("Enter your choice: ");
          choice=sc.nextInt();
          switch(choice)
            {
              case 1: medobj.InsertMedicine();
                break;
              case 2: medobj.deleteMedicine(); 
                break;
              case 3: medobj.searchMedicine();
                break;
              case 4: medobj.displayMedicine();
                break;
              default: System.out.println(" Invalid Option!");
            }
          System.out.println("Do you want to continue one more operation");
          ch=sc.next().charAt(0);
        }
        while(ch!='n');
    }
  }