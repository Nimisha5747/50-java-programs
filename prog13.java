//a program to print the reverse form of the word.
import java.util.*;
import java.io.*;
class prog13
{
    public static void main(String []args)
    {
         Scanner sc= new Scanner(System.in);
          System.out.println("enter the word");
          String word = sc.next();
         reverse(word);
    }
     static void reverse(String a )
    {
       String change = "";
       for(int i = a.length()-1 ; i>=0 ; i--)
       {
           change += a.charAt(i);
       }
       System.out.println(change);
   }
}

  