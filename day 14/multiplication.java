import java.util.*;

class multiplication
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      
      int firstmatrixrows,firstmatrixcolumn,secondmatrixrows,secondmatrixcolumn,i,j;
      i=d.nextInt();
      j=d.nextInt();
      System.out.println(" Enter Dimensions of first Matrix: ");
      firstmatrixrows=d.nextInt();
      firstmatrixcolumn=d.nextInt();
      
     System.out.println(" Enter Dimensions of second Matrix: ");
      secondmatrixrows=d.nextInt();
      secondmatrixcolumn=d.nextInt(); 

      int firstmatrix[][]=new int[firstmatrixrows][firstmatrixcolumn];
      int secondmatrix[][]=new int[secondmatrixrows][secondmatrixcolumn]; 
      
      System.out.println(" Give data for first matrix ");
      for(int i=0; i<firstmatrixrows; i++)
        {
          for(int j=0; j<firstmatrixcolumn; j++)
            firstmatrix[i][j]=d.nextInt();
        }
     System.out.println(" Give data for second matrix ");
      for(int i=0; i<secondmatrixrows; i++)
         {
          for(int j=0; j<secondmatrixcolumn; j++)
            secondmatrix[i][j]=d.nextInt();
        }
  multiplication(firstmatrix,firstmatrixrows,firstmatrixcolumn,secondmatrix,secondmatrixrows,secondmatrixcolumn);
    }
      
      int resultmatrix[][]=new int[firstmatrixrows][secondmatrixcolumn];
    
   static void multiplication(int f[][],int r1,int c1,int s[][],int r2,int c2)
    {
      int resultmatrix[][]=new int[r1][c2];
      if(c1==r2)
      {
        for(int i=0;i<r1;i++)
          {
            for(int j=0;j<c2;j++)
              {
                for(int k=0;k<c1;k++)
                  resultmatrix[i][j]=resultmatrix[i][j]+f[i][k]*s[k][j];
              }
          }
      }
      System.out.println(resultmatrix[i][j]+"");
    }
    
  }