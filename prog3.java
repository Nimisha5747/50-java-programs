//program to check for a spy number.
import java.util.*;
import java.io.*;
class prog3
{
    public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int n = sc.nextInt();
      int b , c , sum =0, pro=1;
      while(n>0)
      {
         b = n%10;
         c = n/10;
         sum +=b ;
         pro *=b ;
         n = c ;
      }
      if(sum==pro)
      { 
         System.out.println("spy number");
       }
       else
       {
          System.out.println("not a spy number");
       }
     }
}
             
        