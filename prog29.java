//program to sort an array in ascending order.
import java.util.*;
class prog29
{
    public static void main(String []args)
    {
        int ar[] = {21,56,3,0,3,6,78};
        int l= ar.length;
        int temp;
        System.out.println("unsorted array");
        for(int i = 0 ; i < l ;i++)
        {
            System.out.print(ar[i]+" ");
        }
        for(int i = 0; i < l ; i++)
        {
            int min = i;
            for(int j = i ; j < l ; j++)
            {
                 if(ar[min]>ar[j])
                 {
                     min = j;
                 }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        System.out.println();
        System.out.println("sorted array:");
        for(int i = 0 ; i < l ;i++)
        {
            System.out.print(ar[i]+" ");
        } 
   }
}
         