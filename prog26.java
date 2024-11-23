//program to display the sum of every element of rows and columns of a 3x3 matrix
import java.util.*;
class prog26
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       int M[][] = new int[3][3];
       System.out.println("enter the elements of a 3x3 matrix");
       for(int i = 0 ; i < 3; i++)
       {
          for(int j =0 ; j< 3 ; j++)
          {
              M[i][j] = sc.nextInt();
          }
       }
        System.out.println("original matrix");
       for(int i = 0 ; i < 3; i++)
       {
          for(int j =0 ; j< 3 ; j++)
          {
               System.out.print(M[i][j]+" ");
          }
           System.out.println();
       }
       for(int i = 0 ; i < 3 ; i++)
       {
          int sum =0;
          for(int j = 0 ; j < 3 ; j++)
          {
             sum = sum + M[i][j];
          }
          System.out.println("sum of row "+(i+1)+" is : "+sum);
       }
       for(int i = 0 ; i < 3 ; i++)
       {
          int sum =0;
          for(int j = 0 ; j < 3 ; j++)
          {
             sum = sum + M[j][i];
          }
          System.out.println("sum of column "+(i+1)+" is : "+sum);
       }  
   }
}
        