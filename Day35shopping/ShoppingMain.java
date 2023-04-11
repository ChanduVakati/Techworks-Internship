//Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.

import java.util.*;
class ShoppingCartMain
  {
    public static void main(String arg[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      ShoppingImp shobj=new ShoppingImp();
      System.out.println("1.Add Shopping Cart Details:");
      System.out.println("2.Remove Shopping Cart Details:");
      System.out.println("3.Display Shopping Cart Details:");
      do
        {
          System.out.println("Enter your choice: ");
          choice=sc.nextInt();
          switch(choice)
            {
              case 1: shobj.addShoppingCart();
                break;
              case 2: shobj.removeShoppingCart(); 
                break;
              case 3: shobj.displayShoppingCart();
                break;
              default: System.out.println(" Invalid Option!");
            }
      System.out.println(" Do you want to continue one more operation: ");
          ch=sc.next().charAt(0);
        }
    while(ch!='n');
   }
  }