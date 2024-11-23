//program to sort a 4x4 array using bubble sort.
class prog30
{
     public static void main(String []args)
     {
         int ar[][] = { {12,34,5,6}, {45,89,7,3} , {56,12,33,77} ,{44,73,67,92}};
         System.out.println("original array");
         int temp=0;
         for(int i= 0 ; i < 4 ; i++) 
         {
              for(int j= 0 ; j < 4 ; j++)
              {
                  System.out.print(ar[i][j]+" ");
              }
              System.out.println();
         }
         for(int k = 0; k<ar.length ; k++)
         {
             for(int i = 0 ; i < 4 ; i++)
             {
                 for(int j = 1 ;j <4-i ; j++)
                 {
                    if(ar[k][j-1]>ar[k][j])
                    {
                       temp = ar[k][j-1];
                       ar[k][j-1] =ar[k][j];
                       ar[k][j]=temp;
                    }
                 }
             }
         }
         System.out.println("sorted array");
         for(int i= 0 ; i < 4 ; i++) 
         {
              for(int j= 0 ; j < 4 ; j++)
              {
                  System.out.print(ar[i][j]+" ");
              }
              System.out.println();
         }
     }
}    