import java.util.Scanner;

class twoDimensionalarray
  {
    public static void main(String args[])
    {
      int row,column;
      Scanner d=new Scanner(System.in);
      int arr[][]=new int [row][column];
      System.out.println(" Enter the size of row in element ");
      int row=d.nextInt();
      System.out.println(" Enter the size of column in element ");
      int column=d.nextInt();
      
      for(i=0; i<=row; i++)
        
          for(j=0; j<=column; j++)
      arr[i][j]=d.nextInt();
    }
  }