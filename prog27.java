//program to print the sum of the numbers of the diagonals of a 4x4 matrix.
import java.util.*;
class prog27
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int sumDiag1=0 , sumDiag2=0;
        int M[][] = new int[4][4];
        System.out.println("enter the elements of the matrix");
        for(int i = 0 ; i < 4 ; i++)
        {
           for(int j = 0 ; j < 4 ; j++)
           {
               M[i][j] = sc.nextInt();
           }
        }
        System.out.println("original matrix");
        for(int i = 0 ; i < 4 ; i++)
        {
           for(int j = 0 ; j < 4 ; j++)
           {
               System.out.print(M[i][j]+" ");
           }
           System.out.println();
        }
        for(int i = 0 ; i < 4 ; i++)
        {
           for(int j = 0 ; j < 4 ; j++)
           {
               if(i==j)
               {
                  sumDiag1 += M[i][j];
               }
               if(i+j == 3)
               {
                   sumDiag2 +=M[i][j];
               }
           }
        }
        System.out.println("sum of numbers of left diagonal: "+sumDiag1);
        System.out.println("sum of numbers of right diagonal: "+sumDiag2); 
    }
}       

       