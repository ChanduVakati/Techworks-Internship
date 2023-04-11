import java.util.*;
class Employee
  {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() 
    {
        return name;
    }
    
    public String getId() 
    {
        return id;
    }
    
    public double getSalary() 
    {
        return salary;
    }

    public String toString()
    {
        return "Employee [name=" + name + ", Id=" + id + ", salary=" + salary + "]";
    }
    
  }

class EmployeeData
         {
        public static void main(String[] args) 
           {
           ArrayList<Employee> employees = new ArrayList<>();
             
           employees.add(new Employee("Chandu", 40, 80000.0));
           employees.add(new Employee("Kiran", 25, 40000.0));
           employees.add(new Employee("Kumar", 55, 700000.0));
        
           System.out.println("All employees:");
           for (Employee employee : employees) 
           {
            System.out.println(employee);
            }
        
              employees.remove(1); 
              employees.remove(2);
      
        System.out.println(" All employees after removing an employee: ");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        
        Employee Chandu = employees.get(0);
        Chandu.salary = 80000.0;
        
        System.out.println("All employees after updating an employee's salary:");
        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
    }
}