// In the game he is given a word W and value R. Chef has to perform the remove operation as follows: - He has to remove the subset M of length R in W, M subset is a string such that each letter in it should be same. - After removing the subset , the rest of the string on its left side and right side, concatenated together.
/* Chef has to perform the blasting operation repeatedly, until no more Subset M found.
Your task is to return the final string after all the blast operations have been done.
Input:
A string and an integer, W and R
Output: Print a string, the final string after all the blast operations have been done.
Sample Input 1: ababbaaab 3
Sample Output 1: aba
Sample Input 2: caaabbbaacdddd 2
Sample Output 2: cabc
EXPLANATION: Given ,string 'ababbaaab' and an integer 3 , we have remove a subset of length 3 consisting of same letters, so we remove aaa from string and it becomes 'ababbb' then again we perform remove operation removing 'bbb' as it satisfies condition then string becomes 'aba'.As we connot find any string consisting of same letters of length R we return 'aba'. */


import java.util.Scanner;

class subset
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String string=new String();
      System.out.println(" Give data to string: ");
      string=sc.nextLine();
      int l=sc.nextInt();
      
      int p=subset(string);
      System.out.println(" ");

      subset(string,l);
      }
    
    static int subset(String str,int a)
    {
      for(int i=0; i<str.length; i++)
        {
          for(int j=i+1; j<str.length; j++)
            
        }
    }
  }