class ShoppingCartData
  {
    String itemname;
    String itemtype;
    int itemprice;
    int itemquantity;
    
      ShoppingCartData(String name, String type, int price, int quantity)
        {
        this.itemname=name;
        this.itemtype=type;
        this.itemprice=price;
        this.itemquantity=quantity;
        
        }

	public String getItemname() {
		return itemname;
	}

	public String getItemtype() {
		return itemtype;
	}

	public int getItemprice() {
		return itemprice;
	}

	public int getItemquantity() {
		return itemquantity;
	}
public String toString()
    {
      return itemname+ " " +itemtype+ " " +itemprice+ " " +itemquantity;
    }
  }