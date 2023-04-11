import java.util.*;

class MedicineImp implements MedicineInterface
  {
    ArrayList<MedicineData> medarr=new ArrayList<>();

    public void InsertMedicine()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Medicine Details like name, company name, type, quantity, price ");
      String name=sc.next();
      String companyname=sc.next();
      String type=sc.next();
      int quantity=sc.nextInt();
      double price=sc.nextDouble();

      medarr.add(new MedicineData(name, companyname, type, quantity, price));
      
    }
    public void deleteMedicine()
    {
      Scanner s1=new Scanner(System.in);
      
      if(medarr.size()==0)
      {
        System.out.println(" No Data is Available ");
      }
      else
      {
        String verify=null;
        System.out.println(" Enter Medicine Name to Delete data: ");
        String name1=s1.next();

        for(MedicineData m : medarr)
          {
          if(m.getMed_name()==name1)
            medarr.remove(m);

          verify="found";
          break;
          }
        if(verify==null)
          System.out.println("No Data is Available with this name");
      }
    }
    
    public void searchMedicine()
    {
      Scanner s=new Scanner(System.in);
      if(medarr.size()==0)
      {
        System.out.println("No data is Available");
      }
      else
      {
        String verify = null;
        System.out.println(" Enter Medicine Name to Search Data ");
        String name2=s.next();

        for(MedicineData m : medarr)
          {
            if(m.getMed_name() ==name2)
              System.out.println(m.getMed_name()+" " +m.getMed_companyname()+" "+m.getMed_type()+" "+m.getMed_quantity()+ " " +m.getMed_price());
            verify="found";
            break;
          }
      }    
    }
    public void displayMedicine()
    {
      if(medarr.size()==0)
      {
        System.out.println("No Data is Available");
      }
      else
      {
        Iterator it = medarr.iterator();
        while(it.hasNext())
          System.out.println(it.next());
      }
    }
  }