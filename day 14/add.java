import java.util.Scanner;

class adding
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
      addingoftwonumbers(a,rows,col,b,rows,col);
    }
  
      static void addingoftwonumbers(int arr[][],int rows,int col, int br[][],int a , int b)
    {
      int sum[][]=new int[a][b];
      
      System.out.println(" Sum of two Matrix are: ");
      for(int i=0;i<rows;i++)
        {
          for(int j=0;j<col;j++)
            {
              sum[i][j]=arr[i][j]+br[i][j];
            }
        }
    
          for(int i=0; i<rows; i++)
          {
            for(int j=0; j<col; j++)
              {
                System.out.print(sum[i][j]+" ");
              }
            System.out.println();
          }
        }
    }
  