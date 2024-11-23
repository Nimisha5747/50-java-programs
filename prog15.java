//program for palindrome without using stringbuffer class.
import java.util.*;
class prog15
{
    public static void main(String []args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number to be checked for palindrome");
       int num = sc.nextInt();
       int a = num, b , c , sum =0;
       while(a!=0)
       {
          b = a%10;
          c = a /10;
          sum = (sum * 10) + b; 
          a = c;
       }
       if(num==sum)
       {
        System.out.println("it is palindrome.");
       }
       else
       {
        System.out.println("it is not palindrome.");
       }
   }
} 
