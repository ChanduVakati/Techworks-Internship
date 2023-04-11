class EmployeeData
  {
    int empid;
    String empname;
    double empsalary;

    EmployeeData(int id,String name,double salary)
    {
      empid=id;
      empname=name;
      empsalary=salary;
    }
	public int getEmpid() {
		return empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public double getSalary() {
		return empsalary;
	}

    public String toString()
    {
      return empid+ " " +empname+ " " +empsalary;
    }
  
  }