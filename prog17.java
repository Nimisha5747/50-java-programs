//program to print fibonacci series using recurisve functionto n terms.
import java.util.*;
class prog17
{
    static int n , sum = 0;
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms upto which u want the fibonacci series to be printed.");
        n = sc.nextInt()-2;
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print(a+" , "+b);
        fibo(a,b,c);
    }
    static void fibo(int a , int b,int c )
    {
         if (c<=n)
         {
           sum = a + b ; 
           a = b ;
           b = sum;          
           System.out.print(" , "+b);
           c++;
           fibo(a,b,c);
         }  
     }
}
      