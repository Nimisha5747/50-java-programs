//program to create a pattern with the letter 'a'.
class prog48
{
  public static void main(String []args)
  {
    for(int i = 0 ; i <=4 ; i++)
    {
      for(int j = 4-i ; j>=1;j--)
      System.out.print(" ");
      for(int k = 0 ; k <i+1; k++)
      System.out.print("a ");
      System.out.println();
    }
    for(int i = 1; i<=4 ; i++)
    {
      for(int j = 1 ; j <=i; j++)
         System.out.print(" ");  
      for(int k = 5-i ; k>=1 ; k--)
      System.out.print("a ");
     System.out.println();
    }
  }
}
      