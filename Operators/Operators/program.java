import java.util.Scanner;
// import pacakges 
class Hello
{
public static void main(String ars[])
    {
    
        int x;char y;double z; String h; //default data type is double;
        // to given differnt inputs to any varaible 
        
        // we use input method
        
        // for int varible  -> nextInt();
        // for double varible  -> nextDouble();
        // for char varible  -> next().charAt(0);
        //  for String  varible  -> next().charAt(0)();
// nextInt(),nextDouble(),next().charAt(0), next() predefined methods
 
// lets create object for Scanner class
Scanner d=new Scanner(System.in);  // d is Scanner class object name
    System.out.println("Enter values for x,y,z,h");
        x=d.nextInt();  // to give values from keyboard/ input console        
        y=d.next().charAt(0);
        z=d.nextDouble();
        h=d.next();
        System.out.println("x values is"+x);
        System.out.println("Y value is"+y);
        System.out.println("z value is"+z);
    }
    
    
}