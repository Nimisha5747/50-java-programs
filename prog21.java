//program to print the factorial through recursive.
import java.util.*;
class prog21
{
     static int num , pro ; 
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
        pro = num ; 
        System.out.println("Factorial : "+fact(num));
     }
     static int fact(int num)
     {
        if(num>=1)
        {
            return num * fact(num-1);
        }
        else
        {
          return 1 ; 
        } 
     }
}