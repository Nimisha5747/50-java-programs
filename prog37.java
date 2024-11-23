//program to merge 2 single dimension arrays of length 5 an 10 .
import java.util.*;
class prog37
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int ar1[] = new int[5];
        int ar2[] = new int[10];
        System.out.println("enter the 5 elements of array 1");
        for(int i = 0 ; i < 5 ; i++)
        {
            ar1[i] = sc.nextInt();
        }
        System.out.println("enter the 10 elements of array 2");
        for(int i = 0 ; i < 10 ; i++)
        {
            ar2[i] = sc.nextInt();
        }
        System.out.println("original arrays are:");
        System.out.print("original array 1: ");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.print(ar1[i]+" ");
        }
        System.out.println();
        System.out.print("original array 2: ");
        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.print(ar2[i]+" ");
        }
        System.out.println();
        int ar3[] = new int[15];
        for(int i = 0 ; i < 5; i++)
        {
            ar3[i]= ar1[i];
        }
        for(int i = 5 ; i < 15; i++)
        {
            ar3[i]= ar2[i-(ar1.length)];
        }
        System.out.println();
        System.out.println("new matrix : ");
        for(int i = 0 ; i < 15; i++)
        {
            System.out.print(ar3[i]+" ");
        }
    }
}