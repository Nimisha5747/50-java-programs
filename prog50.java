//progarm to create a file and display information of marks of 10 students in it.
import java.util.*;
import java.io.*;
class prog50
{
   public static void main(String []args) throws IOException
   {
     InputStreamReader sc = new InputStreamReader(System.in);
     BufferedReader stc = new BufferedReader(sc);
     FileWriter fob = new FileWriter("Marks.txt");
     BufferedWriter bob = new BufferedWriter(fob);
     PrintWriter pob = new PrintWriter(bob);
     pob.println("Index No.\tName\tClass\tTotal Marks");
     for(int i = 1 ; i <=10;i++)
     {
        System.out.println("enter the index no of "+i+"child");
        String index = stc.readLine();
        System.out.println("enter the name of "+i+"child");
        String name = stc.readLine();
        System.out.println("enter the class of "+i+"child");
        String clas = stc.readLine();
        System.out.println("enter the total marks of "+i+"child");
        String totalmarks = stc.readLine();
        pob.println(index+"\t"+name+"\t"+clas+"\t"+totalmarks);
     }
     pob.close();
     bob.close();
     fob.close();
    
   }
}
      