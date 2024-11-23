//program to check and print the words which start and end with vowel and which
//do not.
import java.util.*;
class prog49
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the sentence");
     String line = sc.nextLine();
     int startVowel=0 , nostartVowel =0; 
     StringTokenizer ob = new StringTokenizer(line," ",false);
     while(ob.hasMoreTokens())
     {
       String word = ob.nextToken();
       char l = word.charAt(word.length()-1);
       char f = word.charAt(0);
       if(f == 'a' || f == 'e' ||f == 'i' ||f == 'o' ||f == 'u')
       {
           if(l == 'a'||l == 'e'||l == 'i'||l == 'o'||l == 'u')
           {
              startVowel++;
           }
           else
           {
              nostartVowel++;
           }
      }
      else
      {
         nostartVowel++;
      }
     }
System.out.println("number of words that start and end with vowel:"+startVowel);
System.out.println("number of words that do not start and end with vowel:"+nostartVowel);
  }
}     
       

     