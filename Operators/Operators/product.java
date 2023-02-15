import java.util.Scanner;
class productDetails
  {
    public static void main(String arg[])
    {
      String name;
      int price,sell_price;
      Scanner Obj = new Scanner(System.in);
      name =Obj.next();
      price =Obj.nextInt();
      sell_price = (price*10)/100+price;
      System.out.println("sell price of product is"+ sell_price); 
    }
  }