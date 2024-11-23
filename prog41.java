//program to compute the wage of an employee.
import java.util.*;
class prog41
{
    static String n ;
    static int h ;
    static double r , w ;
    prog41(String nm , int hrs , double rate )
    {
         n = nm ;
         h = hrs;
         r = rate;
    }
    void calwage()
    {
     if(h<=40)
     {
        w = r*h;    
      }
     if(h>40 ||h<=60)
     {
        w = 40*r + (h-40)*1.5*r;
     }
     if(h>60 || h<=80)
     {
        w = 40* r + (20*1.5*r) + (h-60)*2*r ;
     }
    }
     void display()
    {
        System.out.println("name : "+n);
        System.out.println("hours : "+h);
       System.out.println("rate : "+r);
       System.out.println("wage : "+w);
    }
    public static void main(String []args)
    {
      prog41 obj = new prog41("nimisha", 45 , 4);
      obj.calwage();
      obj.display();
    }
  }
