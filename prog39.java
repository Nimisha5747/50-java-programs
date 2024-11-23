//program to delete a given number from a single dimension array of 10 elements.
import java.util.*;
class prog39
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      int ar[] = new int[10];
      System.out.println("enter the 10 elements of the array.");
      for(int i = 0 ; i < 10 ; i++)
      {
          ar[i]= sc.nextInt();
      }
      System.out.println("enter the position: ");
      int index = sc.nextInt();
      for(int i = index-1 ; i < 10-1 ; i++)
      {
         ar[i] = ar[i+1];
      }
      System.out.println("The new array:");
      for(int i = 0 ; i < 10-1 ; i++)
      {
          System.out.print(ar[i]+" ");
      }  
   }
}