//program to check a year for a leap year.
import java.util.*;
class prog23
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year in 4 - digit");
        int year = sc.nextInt();
        if(year%4==0)
        {
           System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
   }
} 