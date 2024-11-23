//program to print the sum of the series 0+ 1/1! + 2/2! + 3/3! + ...+n.
import java.io.*;
import java.util.*;
class prog6
{
    int sum =0 , fact = 1;
    public static void main(String []args)
    {  
        try
        {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the u=number of terms");
           int n = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("error occurred"+e.getMessage());
        }
        finally
        {
            for(int i = 1 ; i< n ; i++)
            {
                 for(int j = i ; j > 1 ; j--)
                 {
                       fact = fact * j;
                 }
                 sum += (1/fact);
            }
        System.out.println("the sum of the series is "+sum );
        }
     }
}
         
        