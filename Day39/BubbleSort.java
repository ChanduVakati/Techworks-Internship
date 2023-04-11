import java.util.*;

class BubbleSort
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int size=sc.nextInt();
      int arr[]=new int[size];

      System.out.println("Enter the array Elements:");
      for(int i=0;i<+size;i++)
        arr[i]=sc.nextInt();

      int temp;
      for(int i=0;i<size-1;i++)
        {
          for(int j=0;j<size-1;j++)
            {
              if(arr[j]>arr[j+1])
              {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }
          System.out.println(arr[i]);
        }
    }
  }