// Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.

import java.util.Scanner;

class product
  {
    String Product_Name;
    double Product_Price;
    int Product_Quantity;

    void getdetails()
    {
      System.out.println(Product_Name+ " is name of product. ");
      System.out.println(Product_Price+ " is price of product. ");
      System.out.println(Product_Quantity+ " is quantity of product. ");
    }
    void setdetails()
    {
      System.out.println(" Enter Details of Product: ");
      Scanner sc=new Scanner(System.in);

      System.out.println(" Enter Product Name: ");
      Product_Name=sc.nextLine();

      System.out.println(" Enter Product price: ");
      Product_Price=sc.nextDouble();

      System.out.println(" Enter product Quantity: ");
      Product_Quantity=sc.nextInt();
      
    }
  }

class PointOfSale
  {
    public static void main(String arg[])
    {
      product p=new product();
      p.setdetails();
      p.getdetails();
     
    }
  }