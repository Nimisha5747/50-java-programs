//program to print the new number in string format obtained by multiplying the
// inputed number(in string format) by 2.  
import java.io.*;

public class prog46 
{

   
  public static void main(String []args)  
 {
      
    InputStreamReader sc =new InputStreamReader(System.in);
       
    BufferedReader stc = new BufferedReader(sc);
  
    String word = " ";
    int num = 0;      
    try
    { 
       
    System.out.println("Enter the desired number in string format");
          
    word = stc.readLine();
 
    num = Integer.parseInt(word);

    System.out.println("originally entered number : "+word);
          
    num = num*2;

    word = Integer.toString(num);
        
    System.out.println("changed number : "+word);
    }
    catch (Exception e)
    {
        System.out.println(e);
        System.out.println(e.getMessage()+" is not valid");
    }
      
  }

}
