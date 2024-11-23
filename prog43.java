//program to calculate the sum of all the brder elements and the non border //elements and display it individually.
import java.util.*;
class prog43
{
   public static void main(String []args)
   {
     int sumOfBorder = 0 , sumOfAll = 0 , sumOfnonBorder = 0 ;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of rows of the array:");
     int r = sc.nextInt();
     System.out.println("enter the number of columns of the array:");
     int c = sc.nextInt();
     int ar[][] = new int[r][c];
     System.out.println("enter the elements of the array:");
     for(int i = 0 ; i < r ;i++)
     {
       for(int j = 0 ; j < c ; j++)
       {
          ar[i][j] = sc.nextInt();
       }
     }
     System.out.println("original array is :");
     for(int i = 0 ; i < r ;i++)
     {
       for(int j = 0 ; j < c ; j++)
       {
          System.out.print(ar[i][j]+" ");
       }
       System.out.println();
     } 
     for(int i = 0 ; i < r ;i++)
     {
       for(int j = 0 ; j < c ; j++)
       {
          sumOfAll +=ar[i][j] ;
       }
     }
     for(int i = 0 ; i < r ;i++)
     {
       if(i==0 || i==r-1)
       {
          for(int j = 0 ; j < c ; j++)
          sumOfBorder += ar[i][j];
       }
       else
       {
          for(int j = 0 ; j < c ; j++)
          {
            if(j==0 || j==c-1)
            {
               sumOfBorder += ar[i][j];
            }
          }
       }
     }
     sumOfnonBorder = sumOfAll - sumOfBorder;
     System.out.println("sum of border elements = "+sumOfBorder);
     System.out.println("sum of non-border elements = "+sumOfnonBorder);
   }
}