//program to check for a pronic number.
import java.util.*;
class prog25
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to be checked");
    int num = sc.nextInt();
    int flag = 0 , m=0 , n=0;
    for(int i=2; i<num/2 ; i++)
    {
       int x = i*(i+1);
       if(x==num)
       {
           flag = 1;
           m = i ; 
           n = i+1;
           break;
       }
    }
    if(flag==1)
    {System.out.println("number "+num+" is pronic:");
    System.out.println(m+" x "+n+" = "+num); }
    else
    System.out.println("number "+num+" is not pronic");
  }
}     