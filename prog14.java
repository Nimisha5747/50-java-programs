//program to fibonacci series without using recursive function to n terms.
import java.util.*;
class prog14
{
    public static void main(String []args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = sc.nextInt();
        System.out.println("fibonacci series upto n terms is :");
        fact(n);
    }
    static void fact(int n)
    {   
        int a = 0, b =1 ,c = 0;
        System.out.print(a+","+b);
        for(int i = 1 ; i <=n-2 ;i++ )
        { 
            c = a+b;
            System.out.print(","+c);
            a = b;
            b = c;
        }
    }
}
          
            
        