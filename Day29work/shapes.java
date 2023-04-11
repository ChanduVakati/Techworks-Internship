// Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.

import java.util.*;

class InvalidDimensions extends Exception
  {
    public InvalidDimensions(String message)
    {
      super(message);
    }
  }

class shape
  {
     double radius;
     double length;
     double breadth;
     double area;

    void Area_of_circle()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter the Radius ");
      radius=sc.nextDouble();
       if(radius<=0)
    {
       try
       {
      throw new InvalidDimensions("radius must be greater than zero"); 
       }
     catch(InvalidDimensions i)
       {
         System.out.println(i);
       }
    }
       else
       {
          area=radius * radius * Math.PI;
         System.out.println(" Area of a circle is: " +area);
       }
     }
    
   void Area_of_Rectangle()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter length and breadth for Rectangle ");
       double length=sc.nextDouble();
       double breadth=sc.nextDouble();
    
       if(length<=0 && length<=0)
       {
          try
          {
          throw new InvalidDimensions("length and breadth must be greater than zero"); 
          }
          catch(InvalidDimensions i)
          {
             System.out.println(i);
          }
       }
       else
       {
        area=length*breadth;
        System.out.println(" Area of a Rectangle is: " +area);
        }
  }
    
void Area_of_Triangle()
  {
     Scanner s=new Scanner(System.in);
     System.out.println(" Enter the length and breadth for Triangle ");
       double length=s.nextDouble();
       double breadth=s.nextDouble();
       if(length<=0 && length<=0)
       {
        try
       {
      throw new InvalidDimensions("length and breadth must be greater than zero"); 
       }
     catch(InvalidDimensions i)
       {
         System.out.println(i);
       }
       }
   else
       {
        area=0.5*(length*breadth);
        System.out.println(" Area of a Triangle is: " +area);
        }
    
    }
}

class Shapes
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" Enter the dimension calculation: ");
      int p=s.nextInt();
      shape[] sha=new shape[p];
      
      for(int i=0;i<=p;i++)
        {
          sha[i]=new shape();
          
          sha[i].Area_of_circle();
          sha[i].Area_of_Rectangle();
          sha[i].Area_of_Triangle();
  
        }
    }
  }