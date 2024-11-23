//program to input a sentence and replace all separate words 'a' with 'an'.
import java.util.*;
class prog44
{
  public static void main(String []args)
  {
     Scanner sc =  new Scanner(System.in);
     System.out.println("enter the sentence either in lowercase or uppercase.");
     String line = sc.nextLine();
     line = ' '+line+' ';
     int len = line.length();
     for(int i = 1; i<len ; i++)
     {
        char b = line.charAt(i);
        char a = line.charAt(i-1);
        char c = line.charAt(i+1);
        if(b=='a' || b=='A')
        {
          if(a==' ' && c==' ')
          {
              if(b=='a')
              {
                 line = line.substring(0,i)+"an"+line.substring(i+1,len);
              }
              else
              {
                  line = line.substring(0,i)+"AN"+line.substring(i+1,len); 
              }
 
          }
        }
      }
      System.out.println("the new string is : "+line);
   }
}
          