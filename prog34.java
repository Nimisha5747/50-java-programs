//program to transpose a 2 dimensional array.
import java.util.*;
class prog34
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number of rows of the array");
       int r = sc.nextInt();
       System.out.println("enter the number of columns of the array");
       int c = sc.nextInt();
       System.out.println("enter the elements of the array");
       int ar1[][] = new int[r][c];
       for(int i = 0 ; i<r ; i++)
       {
          for(int j= 0 ; j<c ; j++)
          {
             ar1[i][j] = sc.nextInt();
          }
       }
       System.out.println("original array");
       for(int i = 0 ; i<r ; i++)
       {
          for(int j= 0 ; j<c ; j++)
          {
             System.out.print(ar1[i][j]+" ");
          } System.out.println();
       }
       System.out.println();
       int ar2[][] = new int[c][r];
       for(int i = 0 ; i < r ; i++)
       {
          for(int j= 0 ; j<c ; j++)
          {
             ar2[j][i] = ar1[i][j];
          }
       }
       System.out.println();
       System.out.println("the new transposed array is");
       for(int i = 0 ; i<r ; i++)
       {
          for(int j= 0 ; j<c ; j++)
          {
             System.out.print(ar2[i][j]+" ");
          }
         System.out.println();
       }
   }
}    


        
    