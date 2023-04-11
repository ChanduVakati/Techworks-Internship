//Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

import java.util.Scanner;

class Dish
  {
    String Name;
    String ingredients;
    double price;

    ConstructorEx(String s, String p, double b)
    {
      Name = s;
      ingredients = p;
      price = b;
    }
    void getdetails()
    {
      System.out.println(Name);
      System.out.println(ingredients);
      System.out.println(price);
    }
    void setdetails()
    {
      System.out.println(" Welcome to our restaurent ");
      Scanner sc=new Scanner(System.in);
      
      System.out.println(" Enter your favourite Dish Name: ");
      Name=sc.nextLine();

      System.out.println(" Choose your ingredients what you have: ");
      ingredients = sc.nextLine();

      System.out.println(" Enter price you want: ");
      price = sc.nextInt();
      
    }
  }

  class Restaurant
    {
      public static void main(String arg[])
      {
        Dish d = new Dish();
        d.setdetails();
        d.getdetails();
      }
    }