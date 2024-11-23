//program to check for a tech number.
import java.util.*;
class prog4
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = sc.nextInt();
        String num2 = Integer.toString(num);
        System.out.println("number entered : "+num);
        if(num2.length()%2!=0)
        {
           System.out.println("it is not a tech number ");
        }
        else
        {
           String part1 = num2.substring(0,num2.length()/2);
           String part2 = num2.substring(num2.length()/2);
           int x = Integer.parseInt(part1);
           int y =  Integer.parseInt(part2);
           int sum = x+y;
          if(Math.pow(sum,2)==num)
           {System.out.println("it is a tech number");}
           else {System.out.println("it is not a tech number");}
        }
     }
}