//a menu-driven program to display the pattern of a string either first
//letter of every word(F) or the last letter(L) of every word vertically.
import java.io.*;
import java.util.*;
class prog9
{
     public static void main(String []args) throws IOException
     {
            InputStreamReader sc = new InputStreamReader(System.in);
            BufferedReader stc = new BufferedReader(sc);
            System.out.println("choose one: 1.first letter(F) 2.last letter(L)");
            String option = stc.readLine();
            System.out.println("enter the sentence");
            String sent = stc.readLine();
            sent = " "+sent+" ";
            switch(option)
            {
                case "F" : for(int i = 0 ; i<sent.length()-1 ; i++)
                           {
                              if(sent.charAt(i)==' ')
                              System.out.println(sent.charAt(i+1));
                           }
                           break;
                case "L" : for(int i = 0 ; i<sent.length()-1 ; i++)
                           {
                              if(sent.charAt(i+1)==' ')
                              System.out.println(sent.charAt(i));
                           }
                           break;
                default : System.out.println("Enter 'F' OR 'L' as choice.");
            }
      }
}
 
                                  