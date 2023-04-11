// Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.

import java.util.Scanner;

class shape
  {
    String color;
    double length;
    double breadth;
    double radius;
    double height;
    
    shape()
    {
      
    }
    
    shape(String s1)
    {
      this.color=s1;
    }
    void getdetails()
    {
      System.out.println(color);
    }
  }
class Rectangle extends shape
  {
    double area;

    Rectangle(double a1,double b1,double area1)
    {
      super();
      this.length=a1;
      this.breadth=b1;
      this.area=area1;
      
    }

void getdetails()
  {
  System.out.println(area);
  }
    void Rectangleareacalculation()
    {
      double totalarea;
      totalarea=a1*b1;
      System.out.println(totalarea+ " is total rectangle area ");
    }
  }


class triangle extends shape
  {
    double area;

    triangle(double n1,double n2,double n3)
    {
      super();
      this.breadth=n1;
      this.height=n2;
      this.area=n3;
      
    }
    void getdetails()
    {
      System.out.println(area);
    }
    void triangleareacalculation()
    {
      double totalarea1;
      totalarea1=1/2*n1*n2;
      System.out.println(totalarea1+ " is total area of triangle. ");
    }
  }

class circle extends shape
  {
    double area;

    circle(double r1,double area)
    {
      super();
      this.radius=r1;
      this.area=area;
      
    }
    void getdetails()
    {
      System.out.println(area);
    }
    void circleareacalculation()
    { 
      double totalarea2;
      totalarea2=r1*r1*Math.PI;
      System.out.println(totalarea2+ " is the circle area ");
    }
    
  }

class ShapeTester
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" Enter shape of color: ");
      String cl=s.nextInt();
      shape sh=new shape();
      sh.calculatearea();
      
      System.out.println(" Enter length and breadth of Rectangle:  ");
      double a1=s.nextDouble();
      double b1=s.nextDouble();
      Rectangle re=new Rectangle(l,b);
      re.getdetails();
      re.Rectangleareacalculation();

      System.out.println(" Enter breadth and height of traingle: ");
      double n1=s.nextDouble();
      double n2=s.nextDouble();
      triangle tr=new triangle(br,hei);
      tr.getdetails();
      tr.triangleareacalculation();

      System.out.println(" Enter radius of circle: ");
      double r1=s.nextDouble();
      circle c1=new circle(ra);
      c1.getdetails();
      c1.circleareacalculation();
      
    }
  }