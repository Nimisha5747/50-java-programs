//program to receive any 3 integer values in the range 100 to 999 and after //concatenation create a long value.
import java.util.*;
class prog47
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the three integer values in the range100<N<999");
    Integer a = sc.nextInt();
    Integer b = sc.nextInt();
    Integer c = sc.nextInt();
    String A = a.toString();
    String B = b.toString();
    String C = c.toString();
    String ABC = A+B+C;
    Long abc = Long.parseLong(ABC);
    System.out.println(abc);
  }
}
    
    
    