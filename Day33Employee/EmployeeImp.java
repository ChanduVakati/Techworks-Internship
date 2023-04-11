import java.util.*;

class EmployeeImp implements EmployeeInterface
  {
    ArrayList<EmployeeData> emparr=new ArrayList<>();
    
    public void insert()
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" Enter employee Details like id , name, salary ");
      int id=s.nextInt();
      String name=s.next();
      double salary=s.nextDouble();
      emparr.add(new EmployeeData(id,name,salary));
      
     }
    public void delete()
    {
      Scanner sc=new Scanner(System.in);
      String verify=null;
      if(emparr.size()==0)
      {
        System.out.println("NO data is Available to delete data: ");
      }
      else
      {
        System.out.println("Enter Employee to delete Data:");
        int empid=sc.nextInt();
      
      for(EmployeeData e : emparr)
        {
          if(e.getEmpid()==empid)
            emparr.remove(e);
          
           verify="found";
          break;
        }
      if(verify == null)
        System.out.println(" No data available with this id. ");
      }
    }
    public void search()
    {
      Scanner sc=new Scanner(System.in);
      if(emparr.size() == 0)
        System.out.println("NO data is Available to Search data: ");
     else
      {
        String verify = null;
        System.out.println("Enter Employee id to search data");
        int empid=sc.nextInt();
        for (EmployeeData e : emparr)
          {
            if (e.getEmpid() == empid)
              System.out.println(e.getEmpid() +" " + e.getEmpname()+" "+e.getSalary());
            verify = "found";
            break;
          }
      }
      
    }
    public void display()
    {
      if(emparr==null)
        System.out.println("NO data is Available ");
      else
      {
      Iterator itr=emparr.iterator();
      while(itr.hasNext())
        System.out.println(itr.next());
      }
    }
  }