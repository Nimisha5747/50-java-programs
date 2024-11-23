//program to shift the elements of a 1 dimensional array in a cyclic manner.
import java.util.*;
class prog35
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = {34,5,78,89,13,45};
        int len = ar.length;
        int arr[] = new int[len];
        arr[0] = ar[len-1];
        System.out.println("original array");
        for(int i = 0 ; i < len ; i++)
        {
            System.out.print(ar[i]+" ");
         }
        for(int i = 1 ; i < len ; i++)
        {
            arr[i]=ar[i-1];
         }
         System.out.println();
         System.out.println("shifted array");
         for(int i = 0 ; i < len ; i++)
         {
             System.out.print(arr[i]+" ");
         }
    }
}