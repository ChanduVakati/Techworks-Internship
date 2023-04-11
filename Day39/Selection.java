import java.util.*;

class SelctionSort
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int size=sc.nextInt();
      int arr[]=new int[size];

      System.out.println("Enter array Elements:");
      for(int i=0;i<+size;i++)
        arr[i]=sc.nextInt();

      int temp;
      for(int j=0;j<size;j++)
        {
          for(int k=j+1;k<size;k++)
            {
              if(arr[j]>arr[k])
              {
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
              }
            }
          System.out.println(arr[j]);
        }
    }
  }