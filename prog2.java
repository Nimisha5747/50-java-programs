//progrma to conevert a length in total foot or inches as per user's choice 
//using call by reference technique. 
import java.util.*;
class prog2  
{
         static double length ; static int choice ;
         public static void main(String []args)
       {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the length");
            length= sc.nextDouble();
            System.out.println("choose one from below");
            System.out.println("1. into feet ");
            System.out.println("2. into inches ");
            choice = sc.nextInt();
            System.out.println("original length :  "+length);
            prog2 ob = new prog2();
            pass(ob);
       }
         static void pass(prog2 obj )
        {
                switch(obj.choice)
                {
                            case 1 : obj.length = obj.length /12;
                                     System.out.println("new length in feet  :  "+obj.length);
                                     break;
                            case 2: obj.length = obj.length*12;
                                    System.out.println("new length in inches : "+obj.length);
                                    break;
                            default : System.out.println("enter appropriate length");
               }
       }
}



