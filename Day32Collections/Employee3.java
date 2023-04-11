import java.util.*;

class Employee
  {
    private int id;
    private String name;
    private int age;
    private double salary;
    
    public Employee(int id, String name, int age, double salary)
    {
        this.id=id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

	public int getId() // return the value only one attribute
    {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

    public String toString() //to get the Details of employees name,id,age and salary.
    {
      return "id:" +id+ "name:" +name+ "age:" +age+ "Salary:" +salary;
    }
    
  }

class EmployeeDataBase
  {
    public static void main(String a[])
    {
     ArrayList<Employee> employeelist = new ArrayList<Employee>();
      Scanner sc=new Scanner(System.in);
      // add some employees to the list
      // adding /insert
      employeelist.add(new Employee(101,"chandu",23,20000.0));
      employeelist.add(new Employee(102,"kiran",24,30000.0));
      employeelist.add(new Employee(103,"Sunny",25,64000.0));
      
      //travelling operation
      Iterator it =employeelist.iterator();
      while(it.hasNext())
        {
          System.out.println(it.next());
        }
      
      String verify = null;
      // for(Employee e : employeelist)
        // for (datatype variable:array) e-->each employee object in array list
        //e.toString();
        System.out.println(" Enter id to get employee details");
      int sid = sc.nextInt();

      for(Employee e : employeelist)
        {
          if(e.getId()==sid)
          {
            System.out.println( "id:" + e.getId()  +  "name:" + e.getName() + "age:" + e.getAge() + "salary:" + e.getSalary() );
            
           
            // employeelist.remove(sid);
            verify = "found";
            break;
          }
        }
      
      if(verify == null)
      {
        System.out.println("not found");
      }

      String verify1 = null;

      System.out.println(" Enter Id you want to Delete: ");
      int em = sc.nextInt();
      for(Employee e : employeelist)
        {
          if(e.getId() == em)
          {
            System.out.println("id:" + e.getId() + "name:" + e.getName() + "age:" + e.getAge() + "salary:" + e.getSalary());
            
            employeelist.remove(e);
            verify1 = "found";
            break;
          }
         }
      if(verify1==null)
      {
        System.out.println("Not found");
        Iterator itr =employeelist.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      }
    }
  }