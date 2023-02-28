import java.util.Scanner;

class numbers
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println(" enter the size of array: ");
      size=s.nextInt();
      int arr[]=new int[size];
      
      System.out.println(" enter any numbers: ");
      for(int i=0; i<size-1; i++)
        a[i]=s.nextInt();

      countofpositiveevenandzeroes(arr,size);
      countofevenandodd(arr,size);
      countprime(arr,size);
    }
    static void countofpositiveevenandzeroes(int a[],int n)
     {
       int zero_count=0;
      int positive_count=0;
      int negative_count=0;
      for(int i:a)
        {
          if(i==0)
          {
            zero_count=zero_count+1;
          }
          else if(i>0)
          {
            positive_count=positive_count+1;
          }
          else if(i<0)
          {
            negative_count=negative_count+1;
          }
          else{
            System.out.println("invalid number");
          }
        }
     }
    static void countofevenandodd(int b[],int n1)
     {
      int even_count=0;
      int odd_count=0;
       for(int j:b)
        {
          if(j%2==0)
          {
            even_count=even_count+1;
          }
          else{
            odd_count=odd_count+1;
          }
        }
      System.out.println("Total even elements:"+even_count);
      System.out.println("Total odd elements:"+odd_count);
    }
 static void countprime(int c[],int n2)
    {
      int prime_count=0;
      for(int i=2;i<n2-1;i++)
        {
          if(c[i]%i==0)
            prime_count=prime_count+1;
        }
      System.out.println("Total prime elements:"+prime_count);
    }
  }