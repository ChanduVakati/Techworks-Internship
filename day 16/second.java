import java.util.Scanner;

class secondmaxandmin
  {
    public static void main(String arg[])
    {
      int size;
      System.out.println("enter array size:");
      Scanner d=new Scanner(System.in);
      size=d.nextInt();
      int arr[]=new int[size];
      
      System.out.println(" Enter the array elements: ");
      int n=d.nextInt();
      int a[]=new int[n];
      
      for(int i=0;i<=size-1;i++)
        {
        arr[i]=d.nextInt();
        }
       secondmaxandmin(arr,size);
    }
    static void secondmaxandmin(int a[],int n)
    {
      int temp;
      for(int i=0;i<n-1;i++)
        {
          for(int j=i+1; j<n; j++)
            {
            if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      
      
      System.out.println("Second Minimum element :" +a[1]);
      
      System.out.println("Second Maxiximum element:" +a[n-2]);
    }
  }