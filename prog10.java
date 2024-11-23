//to find and display the salary , hra and gross of an employee.
import java.util.*;
class prog10
{
     String name;
     double salary , da, hra , gross;
    public static void main(String []args)
    {
      prog10 sc = new prog10();
      sc.inputdata();
      sc.calculate();
      sc.outputdata();   
    } 
    void inputdata()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter name");
      name =sc.nextLine();
      System.out.println("enter salary");
      salary = sc.nextDouble();
      }
     void calculate()
     {
      da = (15.0/100.0)*salary;
      hra = (10.0/100.0)*salary;
      gross = salary+hra+da;
     }
     void outputdata()
     {
       System.out.println("name :"+name +"\nSalary :"+salary);
       System.out.println("da :"+da+"\nhra: "+hra);
       System.out.println("gross : "+gross);
     }
     }
