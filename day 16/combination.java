import java.util.Scanner;

class segregate
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" Enter the size of array: ");
      int size;
      size=s.nextInt();
      int arr[]=new int[size];
      
      System.out.println(" Enter the elements: ");
      int n=s.nextInt();
      int a[]=new int[n];
      
      int count= arr.length;
  
        segregate01and2(arr, n);
    }
    static void segregate01and2(int arr[], int n)
    {
        int count = 0; 
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == 0)
                count++;
        }
  
        for (int i = 0; i < count; i++)
            arr[i] = 0;
  
        for (int i = count; i < n; i++)
            arr[i] = 1;

        for(int i=0; i<n-1; i++)
          arr[i]=2;
    }
    static void print(int arr[], int n)
    {
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");    
    }
   
}