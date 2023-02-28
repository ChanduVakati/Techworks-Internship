import java.util.*;

class Arrayoperations
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println(" Enter Array Size ");
      int size=d.nextInt();
      int array[]=new int[size];
      System.out.println(" Enter number of elements");
      System.out.println("1.Insert an element in first index.");
      System.out.println("2.Insert an element in last index.");
      System.out.println("3.Insert an element in specified index");
      System.out.println("4.Remove element from first index");
      System.out.println("5.Remove element from last index");
      System.out.println("6.Remove element from specified index");
      System.out.println("7.Remove user eneted element");
      System.out.println("8.Display all in ASC/DESC order.");
      System.out.println("9.Display array elements."); 
      System.out.println("which of the following operation do you want to perform");

      int option=d.nextInt();
      switch(option)
        {
          case 1: InsertAtfirstindex(array,size);
                  break;
          case 2: InsertAtlastindex(array,size);
                  break;
          case 3: InsertAtspecifiedindex(array,size);
                  break;
          case 4: RemoveAtfirstindex(array,size);
                  break;  
          case 5: RemoveAtlastindex(array,size);
                  break;   
          case 6: RemoveAtspecifiedindex(array,size);
                  break;  
          case 7: Removeuserenetedelement(array,size);
                  break;   
          case 8: DisplayDESCorder(array,size);
                  break; 
          case 9: DisplayArrayElements(array,size);
                  break;
        }

        }
      static void insertAtFirstIndex(int arr[],int size)
      {
         System.out.println(" Enter element you want to insert ");
        Scanner p=new Scanner(System.in);
        arr[0]=p.nextInt();
      }
     static void insertAtlastIndex(int arr[],int size)
      {
         System.out.println(" Enter element you want to insert ");
        Scanner d=new Scanner(System.in);
        arr[n-1]=d.nextInt(); 
      }
     static void insertAtspecifiedIndex(int arr[],int size)
      {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter position you want to insert data");
        position=d.nextInt();
      System.out.println("Enter element you want to insert data");  
      arr[position]=d.nextInt();
      }
    static void RemoveAtFirstIndex(int arr[],int size)
   {
    arr[0]=0;    
      }
    static void RemoveAtlastIndex(int arr[],int size)
    {
      arr[n-1]=0;
    }
      static void RemoveAtSpecifiedIndex(int arr[],int size)
    {
    Scanner d=new Scanner(System.in);
    System.out.println(" At what position you want to insert");
      position=d.nextInt();
      arr[position]=0;
    }
      static void Removeuserenetedelement(int arr[],int size)
    {
    Scanner d=new Scanner(System.in); 
   System.out.println(" Enter element you want to remove ");
      remove=d.nextInt();

      for(int i=0; i<=size-1; i++)
        {
          if(remove==arr[i])
            arr[i]=0;
          break;
        }
    }
    static void DisplayDESCorder(int arr[],int size)
    {
      
    }
    static void DisplayArrayElements(int arr[],int size)
        {
        for(int k:arr)
          System.out.println(k);
        }
    }
  