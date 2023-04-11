import java.util.*;

class Student
  {
    String name;
    String id;
    int totalmarks;

    Student(String name,String id,int totalmarks)
    {
      this.name=name;
      this.id=id;
      this.totalmarks=totalmarks;
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

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalmarks() {
		return totalmarks;
	}
public String toString()
    {
      return(name+" "+id+" "+totalmarks);
    }
  }

class ArrayListExample
  {
public static void main(String arg[])
    {
      ArrayList<Student> ar1 = new ArrayList<Student>();
  // creating list of students
    ar1.add(new Student("aaa","234",67));
    
    System.out.println(ar1.toString());
    // heterogenous type
    ArrayList<Object> ar2 = new ArrayList<Object>();
    ar2.add(new Student("bbb","456",87));

      System.out.println(ar2.toString());
    
      
    }
  }