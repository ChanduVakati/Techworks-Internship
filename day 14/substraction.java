import java.util.Scanner;

class sub_two_numbers
  {
    public static void main(String args[])
    {
      int rows,col;
     Scanner d = new Scanner(System.in);
     
      System.out.println(" Enter the two matrix inputs: ");
      
      System.out.println(" Enter the size of rows: ");
       rows=d.nextInt();
      
      System.out.println(" Enter the size of col: ");
       col=d.nextInt();
      
      int a[][]=new int[rows][col];
      int b[][]=new int[rows][col];
      
      System.out.println(" enter elements for matrix a ");
      for(int i=0;i<rows;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=d.nextInt();
            }
        }
      System.out.println(" enter elements for matrix b ");
      for(int i=0;i<rows;i++)
        {
          for(int j=0;j<col;j++)
            {
             b[i][j]=d.nextInt();
            }
        }
      substraction(a,rows,col,b,rows,col);
    }

    static void substractiontwonumbers(int arr[][],int a,int b,int br[][],int s,int p)
    {
      int sum[][]=new int[a][b];
    
      System.out.println(" Substraction of two numbers: ");

      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              sum[i][j]=arr[i][j]+(-br[i][j])
                ;
            }
        }
    
          for(int i=0; i<a; i++)
          {
            for(int j=0; j<b; j++)
              {
                System.out.print(sum[i][j]+" ");
              }
            System.out.println();
          }
    }
  }
  