import java.util.*;

class LinearSearch
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int size=s.nextInt();
      int arr[]=new int[size];
      
      System.out.println("Enter the array elements");
      for(int i=0;i<=size;i++)
        arr[i]=s.nextInt();

      System.out.println("Searching the element");
      int sc=s.next();

      String verify=null;
      for(int j=0;j<arr.length;j++)
        if(arr[i]==sc)
          verify="found";
      break;
        else
      System.out.println("Element was not found");
      
    }
  }