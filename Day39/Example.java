import java.util.*;

class BinarySearch
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array:");
      int size=sc.nextInt();
      int arr[]=new int[size];

      System.out.println("Enter array Elements:");
      for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();    
      
      int la=BinarySearchElements(arr,size);
      if(la==-1)
        System.out.println("Element not found");
      else
        System.out.println("Element found at index:" +la);
      
    }
    static int BinarySearchElements(int a[] , int b)
    {
      int location=-1; 
      int first=0; 
      int last=b-1;

      Scanner s=new Scanner(System.in);
      System.out.println("Enter Key Element:");
      int key=s.nextInt();
      
      int middle=(first+last)/2;
      
      while(first<=last)
        {
          if(key==a[middle])
          {
          location=middle;
          break;
          }
          else 
            if(key<a[middle])
            {
              last=middle-1;
            }
          else
              first=middle+1;
        }
      return location;
    }
  }