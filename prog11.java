//program to convert each word of a sentence into piglatin form .  
import java.util.*;
import java.io.*;
class prog11
{   
    String name , word , NEW= " ";
    int flag = 0 ;
    public static void main(String []args)throws IOException
     {
          prog11 ob = new prog11();
          ob.input();
     }
    void prog11()
    { 
         name = "";
     }
     void input()
     {   try
         {
        InputStreamReader sc = new InputStreamReader(System.in);
        BufferedReader stc = new BufferedReader(sc);  
        System.out.println("enter the sentence");
        name = stc.readLine();
        name = name.toLowerCase();
        StringTokenizer st = new StringTokenizer(name , " " , false);
        int num = st.countTokens();
        for(int i = 0 ; i < num; i++ )
        {   
            String token = st.nextToken(" ");
            for (int j = 0 ; j < token.length() ; j++)
            {
              char a = token.charAt(j);
              if(a == 'a' || a =='e' || a=='i' || a=='o' || a=='u')
              {
                 word = token.substring(j)+token.substring(0,j)+"ay";
                 flag = 1; 
                 break;
              } 
              else{  word = token ; }  
           }
           NEW = NEW +word+" ";
           word = "";
        }
      if(flag ==1)
      {System.out.println("piglatin form of the sentence : "+NEW);}
      else {
           System.out.println("piglatin form of the sentence : "+NEW);
           }
        }
      catch(Exception e){  }
     }    
  }
        
           
                