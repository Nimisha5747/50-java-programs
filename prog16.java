//program to swap values of 2 integers through both passing mechanisms.
import java.util.*;
class prog16
{ 
     static int a = 45 , b = 87;
     public static void main(String []args)
     {
         prog16 ob = new prog16();
         System.out.println("original values before swapping through call by value."+a+","+b);
         callbyvalue(a,b);
         System.out.println("final values after swapping through call by value."+a+","+b);
         System.out.println("original values before swapping through call by reference."+a+","+b);
         callbyreference(ob);
         System.out.println("final values after swapping through call by reference."+a+","+b);
     }
     static void callbyvalue(int x , int y )
     {
        int temp;
        temp = x ; x = y ; y = temp;
        System.out.println("INSIDE callbyvalue METHOD :\nSWAPPED VALUES OF a AND b :: a ="+x+",b = "+y);
     }
     static void callbyreference(prog16 obj )
     {
        int temp;
        temp = obj.a ; obj.a = obj.b ;obj.b = temp;
        System.out.println("INSIDE callbyreference METHOD :\nSWAPPED VALUES OF a AND b :: a ="+a+",b = "+b);
     }
}
       
     
         