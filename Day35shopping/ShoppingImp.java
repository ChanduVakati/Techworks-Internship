import java.util.*;

class ShoppingImp implements ShoppingInterface
  {
    ArrayList<ShoppingCartData> shoarr=new Arralist<>();

    public void add()
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" Enter Shopping Cart Details like Item name, Item Type, Item price, Item Quantity ");
      String name=s.next();
      String type=s.next();
      int price=s.nextInt();
      int quantity=s.nextInt();
      shoarr.add(new ShoppingCartData(name,type,price,quantity));
                 
     }

    public void remove()
    {
      Scanner sc=new Scanner(System.in);
      String verify = null;
      if(shoarr.size()==0)
      {
        System.out.println(" No Data is available to remove data ");
      }
      else
      {
        System.out.println("Enter item name to remove");
        String name=sc.next();

        for(ShoppingCartData shc : shoarr)
          {
            if(shc.getItemname()==itemname)
            shoarr.remove(shc);
          
           verify="found";
          break;
          }
        if(verify=null)
        {
          System.out.println("No Data is Available with this name");
        }
      }
    }

    public void display()
    {
      if(shoarr==null)
      {
        System.out.println("No data is Available to display");
      }
      else
      {
        Iterator itr=shoarr.iterator();
        while(itr.hasNext())
          System.out.println(itr.next());
      }
    }
    
  }