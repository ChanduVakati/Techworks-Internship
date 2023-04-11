import java.util.Scanner;

class Alternate
  {
    public static void main(String arg[])
    {
      
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter Size of Array: ");
      int size=sc.nextInt();
      int arr[]=new int[size];

      System.out.println(" Enter Elements in an array: ");
      for(int s=0; s<size; s++)
        arr[s]=sc.nextInt();

      int p=Alternate_Elements(arr,size);
      System.out.println(" Sum of Alternate Elements is: " +p);
      
    }

    static int Alternate_Elements(int array[],int a)
    {
      int sum=0;

      for(int j=0; j<array.length; j=j+2)
        
        sum=sum+array[j];
      
      return sum;
    }
    
  }