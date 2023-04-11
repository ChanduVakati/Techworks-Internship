//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.

import java.util.*;

class Address
  {
    public static void main(String arg[])
    {
      HashMap <String,Address> hm=new HashMap<>();
      hm.put(new AddressBook("Sekhar Turaka",21), "First");
      hm.put(new AddressBook("Chandu",31),"Second");
      
      for(Map.Entry m : hm.entrySet())
        {
          System.out.println(m.getKey() + " " +m.getValue());
        }
    }
  }

class AddressData
  {
    String Person_Name;
    String House_No;
    String Street_Name;
    int pincode;

    AddressData(String Name, String No,String name, int pin)
    {
      this.Person_Name=Name;
      this.House_No=No;
      this.Street_Name=name;
      this.pincode=pin;      
    }

	public String getPerson_Name() {
		return Person_Name;
	}

	public String getHouse_No() {
		return House_No;
	}

	public String getStreet_Name() {
		return Street_Name;
	}

	public int getPincode() {
		return pincode;
	}
    
public String toString()
    {
      return "Name:" + Person_Name + "No: " + House_No + "Street Name: " + Street_Name + "Pincode: " + pincode ;
    }
    
  }