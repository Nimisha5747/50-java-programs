//program to print the exponential result of a and b , 2 numbers .
import java.util.*;
class prog22
{
    static int a , b , c=1; 
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the base");
       a = sc.nextInt();
       System.out.println("enter the power");
       b = sc.nextInt();
       System.out.println("the exponential result : "+expo(a,b));
     }
     static double expo(int a , int b )
     {
        double nm = Math.pow(a,b);
        return nm;
     }
}  
