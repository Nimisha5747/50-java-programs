//program to sort a single dimensional array using recursive.
import java.util.*;
class prog36
{
     static int min =0 , i=0,j=0,temp=0 , n=0 ;
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0 ; i < n ; i++)
        ar[i] = sc.nextInt();
        System.out.println("original array:");
        for(int i = 0 ; i < n ; i++)
        System.out.print(ar[i]+" ");
        System.out.println();
        recur(ar , min , i , j);
        System.out.println("sorted array:");
        for(int i = 0 ; i < n ; i++)
        System.out.print(ar[i]+" ");
      } 
      static void recur(int ar[] , int min , int i, int j)
      {   
        if(i<n)
        { 
           if(j<n)
           {    
             if(ar[min]>ar[j])
             {
                min=j;
                recur(ar,min,i,j+1);
             }
             else
             {
                 recur(ar,min,i,j+1);
             }    
           }
           else
           {
              temp = ar[i];
              ar[i] = ar[min];
              ar[min] = temp; 
              recur(ar,i+1,i+1,i+1);
           }
        }
    }
}

