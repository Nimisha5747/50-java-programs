//Program to invoke a function satis to find 4 integers A,B,C,D sent to 
//satis satisfy the equation A^3 + B^3+ C^3 = D^3 or not ? it returns o if 
//satisfied otherwise 1.

import java.io.*;
import java.util.*;
class prog7
{
    public static void main(String []args)
    {
       int res = satis(0,0,0,0);
       if(res == 0)
       {
          System.out.println("equation satisfied");
       }
       else 
       {
          System.out.println("equation not satisfied");
        }
    }
    static int satis(int A , int B , int C , int D )
    {
         if((Math.pow(A,3)+Math.pow(B,3)+Math.pow(C,3))==(Math.pow(D,3)))  
          { 
              return 0;
          }
          else
          {
             return 1;
          }
     }
}
