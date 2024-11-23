//program to swap the elements of two single dimensional arrays.
import java.util.*;
class prog28
{
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
         int ar1[] = {21,34,56,67,0};
         int ar2[] = {66,1,5,89,78};
         int l = ar1.length;
         int temp=0;
         System.out.println("original array 1 is:");
         for(int i = 0 ; i < l; i++)
         {
            System.out.print(ar1[i]+" ");
         }
         System.out.println();
         System.out.println("original array 2 is:");
         for(int i = 0 ; i < l ; i++)
         {
             System.out.print(ar2[i]+" ");
         }
         System.out.println();
         for(int i = 0 ; i < l; i++)
         {
             temp = ar2[i];
             ar2[i] = ar1[i];
             ar1[i] = temp ;
         }
         System.out.println();
         System.out.println("changed array 1 is:");         
         for(int i = 0 ; i < l ; i++)
         {
             System.out.print(ar1[i]+" ");
         }
         System.out.println();
         System.out.println("changed array 2 is:");
         for(int i = 0 ; i < l ; i++)
         {
             System.out.print(ar2[i]+" ");
         }
    }
}
 