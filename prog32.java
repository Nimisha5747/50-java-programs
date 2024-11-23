//program to search an element in a single dimensional array using binary search.
import java.util.*;
class prog32
{
   public static void main(String []args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of the single dimensional array .");
     int n = sc.nextInt();
     int ar[] = new int[n];
     System.out.println("enter the elements of the array in ascending order.");
     for(int i = 0 ; i < n ; i++)
     {
         ar[i] = sc.nextInt();
     }
     System.out.println("original array");
     for(int i = 0 ; i < n ; i++)
     {
         System.out.print(ar[i]+" ");
     }
      System.out.println();
     System.out.println("enter the number to be searched");
     int num = sc.nextInt();  
     int ul = n-1 , ll = 0 , flag = 0;  // ul=upper limit and ll= lower limit.
     int mid = 0;
     while(ul>ll)
     {
        mid = (ul + ll)/2;
        if(num == ar[mid])
        {
           flag = 1;
           break;
        }
        else
        {
           if(num>ar[mid]) 
           {
             ll=mid;  
           }
           else
           {
             ul=mid;
           }      
        }
     }
     if(flag == 1)
     {
         System.out.println("number found on "+(mid+1)+" position");
     }
     else
     {
        System.out.println("number not found");
     }
   }
}         
     