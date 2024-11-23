//program to calculate GCD through recursive function.
import java.util.*;
class prog18
{
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers one by one");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD IS = "+recur(a,b));
     }
     public static int recur(int a , int b )
     {
        if(a>b)
        {
            if(a%b!=0)
            {
               recur(a%b , b);
            }
            else{return b ;}
        }
        else
        {
            if(b%a !=0 )
            {
               recur(b%a , a );
            }
            else { return a ; }
        }return 1;
     }
}   

