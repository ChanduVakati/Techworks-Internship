import java.util.Scanner;

class diagonal
  {
    public static void main(String args[])
    {
      int row,col;
      Scanner d=new Scanner(System.in);
      
      System.out.println(" Enter the size of row: ");
      row=d.nextInt();
       System.out.println(" Enter the size of col: ");
      col=d.nextInt();

      int array[][]=new int[row][col];

       System.out.println(" Enter the elements for matrix: ");

      for(int i=0; i<row; i++)
        {
          for(int j=0; j<col; j++)
            {
              array[i][j]=d.nextInt();
            }
        }
      diagonalofmatrix(array,row,col);
    }
  
      public static void diagonalofmatrix(int arr[][],int r,int c)
       {
        System.out.println(" The diagonal elements in the matrix are: ");
          {
        for(int i=0; i<=r; i++)
          {
            for(int j=0; j<=c; j++)
              {
                if(i==j)
                {
                System.out.println(arr[i][j]+"");
                }
              } 
          }
        }
      
    }
  }