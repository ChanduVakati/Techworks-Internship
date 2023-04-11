import java.util.*;

class Employee
  {
    String name;
    String id;
    double salary;
    
    Employee(String name,String id,double salary)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
public String getSalary()
    {
      return salary;
    }
	public String toString()
    {
      return(name+" "+id+" "+salary);
    }
    
  }

class ArrayList
  {
    public static void main(String arg[])
    {
      ArrayList<Employee> ar1=new ArrayList<Employee>();
 ArrayList<Employee> ar2=new ArrayList<Employee>();
      ArrayList<Employee> ar3=new ArrayList<Employee>();
      ar1.add(new Employee("aa","234",1000));
      ar2.add(new Employee("ab","284",10000));
      ar3.add(new Employee("ac","296",13000));
      
     System.out.println(ar1.getName()); 
      System.out.println(ar1.getId());
      
      System.out.println(ar1.getSalary());
      System.out.println(ar1.getEmployee());
      System.out.println(ar2.remove("ab"));
      System.out.println(ar2.remove("284"));
      
    }
  }