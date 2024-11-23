//program to change the case of each letter of the string.
import java.util.*;
class prog40
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string");
      String s = sc.nextLine();
      String add="";
      char ch;
      for(int i = 0 ; i < s.length(); i++)
      {
         ch=s.charAt(i);
         if(Character.isUpperCase(ch))
         {
             add = add +(Character.toLowerCase(ch));
         }
         else
         {
             if(Character.isLowerCase(ch))
             {
               add = add+(Character.toUpperCase(ch));
             }
             else
             {
               add = add+ch;
             }
         }
      }
      System.out.println("original = "+s);
      System.out.println("new = "+add);
   }
}