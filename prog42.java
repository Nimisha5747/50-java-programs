//program to print a floyd's triangle.
class prog42
{
   public static void main(String []args)
   {
       int n , num = 1;
      for(int d = 1 ; d<=5;d++ )
      {
         for(n =1; n<=d; n++)
         {
             System.out.print(num+" ");
             num++;
         }
          System.out.println();
      }
   }
}