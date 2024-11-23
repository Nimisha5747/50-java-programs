//program to check for a disarium number using recursive.
import java.util.*;
class prog5
{
   static int a,b,num,len;
   static double sum=0.0;
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      int ch;  
       do
       {
         sum=0;
         System.out.println("enter the number");
         num = sc.nextInt();
         String num1 = Integer.toString(num);
         len = num1.length();
         a=num%10;
         b = num/10;
         double sum1 = dis(num , len);
         if(sum==num)
         System.out.println("it is a disarium number.");
         else
         System.out.println("it is not a disarium number");
         System.out.println("if you want to check more enter 1 otherwise 0");
         ch = sc.nextInt();
      }
     while(ch==1);
   }
static double dis(int b , int len)
{
  if(b>0)
  {
  a = b%10;
  b = b/10;
  sum = sum +Math.pow(a,len);
  len--;
  return dis(b,len);
  }
  else
  {
   return sum;
  }
}
}          
         