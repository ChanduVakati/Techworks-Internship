import java.util.*;

class InsertionSort
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of Array:");
      int size =sc.nextInt();
      int arr[]=new int[size];

      System.out.println("Enter the array Elements");
      for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();

      for(int j=1;j<size;j++)
        {
          int key = arr[j];
          int k = j-1;

          while(k>=0 && arr[k]>key)
            {
              arr[k+1]=arr[k];
              k = k-1;
            }
          arr[k+1]=key;
          System.out.println("pass: " +j);
          System.out.println(arr[j]);
        }
    }
  }