//program to shift the consonants of the word at the beginning of the word and 
//change them to upper case and display the original,shifted and changed word.
import java.util.*;
class prog20
{   
    static String word , shifted="" , changed="" ; 
    static int len ; 
    void readword()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the word in lowercase");
       word = sc.next();
       len = word.length();       
    }
    void shiftcons()
    {
       for(int i = 0 ; i < len ; i++)
       {
           char a = word.charAt(i);
           if(a!='a' && a!='e' && a!='i' && a!='o' && a!='u')
           {
              shifted = shifted + a;
           }
       }
       for(int i = 0 ; i < len ; i++)
       {
           char a = word.charAt(i);
           if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
           {
              shifted = shifted + a;
           }
       }
     }
       void changeword()
       {
        for(int i = 0 ; i < len ; i++)
        {
           char a = shifted.charAt(i);
           if(a!='a' && a!='e' && a!='i' && a!='o' && a!='u')
           { 
              char b = Character.toUpperCase(a);
              changed = changed + b;
           }
           else
           {
              changed = changed + a ;
           }
         }
       }
       void show()
       {
          System.out.println("original word : "+word);
          System.out.println("shifted word : "+shifted);
          System.out.println("changed word : "+changed);
       }
       public static void main(String []args)
       {
          prog20 ob = new prog20();
          ob.readword();
          ob.shiftcons();
          ob.changeword();
          ob.show();
       }
}