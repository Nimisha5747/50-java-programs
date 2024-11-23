//program to find new salary of the employees of sponge iron company.  
import java.util.*;
import java.io.*;
class prog12 
{
     String name; double basic ; int age ; 
     prog12(String n , double b , int a )
     {
         name = n ; basic = b ; age = a;
     }
     void calculate()
     {
         if(age>56)
         {
             basic = basic + (20*basic)/100;
         }
         if(age>45 & age<56)
         {
             basic = basic + (15*basic)/100;
         }
         if(age<45)
         {
             basic = basic + (10*basic)/100;
         }
     }
     void display()
     {
         System.out.println("name : "+name);
         System.out.println("age: "  +age);
         System.out.println("updated basic :"+basic);
     }
       public static void main(String []args)
     {
         prog12 ob = new prog12("reena",543.00,54);
         ob.calculate();
         ob.display(); 
     }
}
         
    