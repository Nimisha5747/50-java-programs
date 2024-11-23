//program to insert a number on a position in a single dimension array of 10 //elements.
import java.util.*;
class prog38
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      int ar1[]= new int[10];
      int ar2[] = new int[11];
      System.out.println("enter the 10 elements of the array");
      for(int i =0 ; i < 10 ; i++)
      {
         ar1[i] = sc.nextInt();
         ar2[i] = ar1[i];
      }
      System.out.println("enter the number to be inserted");
      int num = sc.nextInt();
      System.out.println("enter the position");
      int index = sc.nextInt();
      for(int i = 9 ; i >= index-1 ; i--)
      { 
         ar2[i+1] = ar2[i];
      }
      ar2[index-1]= num;
      System.out.println("new array : ");
      for(int i = 0 ; i <11 ; i++)
      { 
       System.out.print(ar2[i]+" "); 
      }
   }
}   
         