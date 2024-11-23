//program to raise a number m to a power n using a function power().
import java.util.*;
class prog19
{
      public static void main(String []args)
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the number and the power one by one");
           int m  = sc.nextInt();
           int n  = sc.nextInt();
           System.out.println("the result is = "+power(m , n));
      }
      static double power(int m , int n)
      {
          return Math.pow(m,n);
      }
}
