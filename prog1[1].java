//program to convert take a temperature as input and convert it either into celcius or farenheit.
import java.util.*;
class prog1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one from the options given below");
        System.out.println("1.convert into celcius");
        System.out.println("2.convert into farenheit");
        int choice = sc.nextInt();
        System.out.println("enter the temperature");
        double temp = sc.nextDouble();
        System.out.println("original temperature = "+temp);
        switch(choice)
        {
             case 1: temp= ((temp-32)*5)/9;
                     System.out.println("new temperature in celcius ="+temp);
                     break;
             case 2 : temp = ((temp*9)/5)+32;
                     System.out.println("new temperature in farenheit ="+temp);
                     break;
             default:     System.out.println("enter apropriate temperature");
        }
    }
}