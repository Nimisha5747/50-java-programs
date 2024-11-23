//program to search an element in a single simensional array using linear search.
import java.util.*;
class prog31
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int l = sc.nextInt();
        int ar[] = new int[l];
        System.out.println("enter the elements");
        for(int i =0 ; i < l ; i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int num = sc.nextInt();
        int flag = 0 , index=0 ;
        System.out.println("original array"); 
        for(int i =0 ; i < l ; i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();   
        for(int i =0 ; i < l ; i++)
        {
           if(ar[i]==num)
           {
              flag = 1 ;
              index = i ; 
           }
        }
        if(flag==1)
        {
           System.out.println("number found on "+(index+1)+" position");
        }
        else
        {
           System.out.println("number not found");
        }
    }
}       