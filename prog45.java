//program to input a sentence and replace all consonants with the previous letter
//otherwise replace with the next letter .display original and changed sentence.
//this is known as cryptography.
import java.util.*;
class prog45
{
   public static void main(String []args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the sentence ");
     String line = sc.nextLine();
     line = line.toLowerCase();
     line = ' '+line+' ';
     int len = line.length();
     for(int i = 0 ; i < len ; i++)
     {
        char a = line.charAt(i);
        if(a=='e' || a=='a' || a=='i' || a=='o' || a=='u')
        {
           int n= (int)a;
           n =n+1;
           char b = (char)n;
           line = line.substring(0,i)+b+line.substring(i+1,len); 
        }
        else
        {
           int n= (int)a;
           n =n-1;
           char b = (char)n;
           line = line.substring(0,i)+b+line.substring(i+1,len);
         }
      }
      System.out.println("new string :"+line);
   }
}