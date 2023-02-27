import java.util.*;

class leapyear
  {
    public static void main(String arg[])
    {
      int year;
      boolean leap=false;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a year:");
      year=sc.nextInt();

      if(year %4==0)
      {
        if(year %100==0)
        {
        if(year %400==0)
           leap=true;
          else 
           leap=false;
        }
      else
        leap=true;
    }
    else
     leap=false;

   if(leap)
    System.out.println("is a leap year"+year);
     else 
    System.out.println("is not a leap year"+year);
    }
  }
  