//program to print the sum of the squares of the digits of a number 'n'.
import java.util.*;
class prog24
{
    public static void main(String []args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number");
        long n = sc.nextLong();
        long a , b , sum =0;
        while(n!=0)
        {
          a = n%10;
          b = n/10;
          sum = sum + (a*a);
          n = b ;
        }
         System.out.println("sum is : "+sum);
    }
}  