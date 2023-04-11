class MedicineData
  {
    String med_name;
    String med_companyname;
    String med_type;
    int med_quantity;
    double med_price;
    
    MedicineData(String  name,String companyname,String type,int qua,double price)
    {
      med_name=name;
      med_companyname=companyname;
      med_type=type;
      med_quantity=qua;
      med_price=price;
      
    }

	public String getMed_name() {
		return med_name;
	}

	public String getMed_companyname() {
		return med_companyname;
	}

	public String getMed_type() {
		return med_type;
	}

	public int getMed_quantity() {
		return med_quantity;
	}
    
	public double getMed_price() {
		return med_price;
	}

  public String toString()
    {
    return  med_name+ " " +med_companyname+ " " +med_type+ " " +med_quantity+ " " +med_price;
    }
  }