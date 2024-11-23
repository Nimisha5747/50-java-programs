//program to input a 3 letter word and print all the possible combinations
//that can be made by shuffling the letters without repetition.
 import java.io.*;
import java.util.*;
class prog8
{ 
    public static void main(String []args)
    {
         int t; 
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a 3 letter word");
         String word = sc.next();
         System.out.println();
         int A = (int)(word.charAt(0));
         int B = (int)(word.charAt(1));
         int C = (int)(word.charAt(2));
         for (int i = 1 ; i<=3 ; i++)
         {
             for (int j = 1 ; j <=2 ; j++)
             {
                 System.out.println((char)A+""+(char)B+""+(char)C);
                 t = B ; B = C; C = t;
             }
             if(i==2)
             {
                t= A ; A = C ; C = t ; 
             }
             else
             {
                t=A ; A = B ; B = t ;
             }
         }
    }
}
                       
        