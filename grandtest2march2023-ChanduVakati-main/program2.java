import java.util.Scanner;

class section1program2
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int size;
      System.out.println(" Enter the size of array: ");
      size=sc.nextInt();
      int arr[]=new int[size];

      System.out.println(" enter the elemnts of array: ");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }

      main(arr,size);
    }
    static void main(int arr[],int a)
    {
      Scanner s=new Scanner(System.in);
      int m=s.nextInt();
      int j,k;
      for(int i=0;i<m;i++)
        {
          k=arr[0];
          for(j=0;j<m-1;j++)
            {
              arr[j]=arr[j+1];
            }
          arr[j]=k;
        }
      
      for(int i=0;i<m;i++)
        {
          System.out.println(arr[i]+" ");
        }
    }
  }