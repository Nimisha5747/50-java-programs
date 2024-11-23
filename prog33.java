//program to search element in a 2 dimensional array.
import java.util.*;
class prog33
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number of rows");
       int  m = sc.nextInt();
       System.out.println("enter the number of columns");
       int  n = sc.nextInt();
       int ar[][] = new int[m][n];
       System.out.println("enter the elements of the array");
       for(int i =0 ; i <m ; i++)
       {
           for(int j = 0 ; j <n ; j++)
           {
              ar[i][j]=sc.nextInt();
           }
       }
       System.out.println("enter the number to be searched");
       int num = sc.nextInt();
       System.out.println();
       System.out.println("original array");
       for(int i =0 ; i <m ; i++)
       {
           for(int j = 0 ; j <n ; j++)
           {
              System.out.print(ar[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println();
       int flag =0;
       for(int i =0 ; i <m ; i++)
       {
           for(int j = 0 ; j <n ; j++)
           {
              if(ar[i][j]==num)
              {
                  flag = 1;
                  m=i;
                  n=j;
                  break; 
              }

           }
       }
       if(flag==1)
       {
          System.out.println("number found in row "+(m+1)+" and coumn "+(n+1));
       }
       else
       {
           System.out.println("number not found");
       }
   }
}