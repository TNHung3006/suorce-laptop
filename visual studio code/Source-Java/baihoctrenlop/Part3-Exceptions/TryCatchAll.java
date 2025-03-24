import java.util.* ;

public class TryCatchAll
{
  public static void main ( String[] a ) 
  {
    Scanner scan = new Scanner( System.in  );
    int    num=0, div=0 ;

    try
    { 
      System.out.print("Enter the numerator: ");
      num = scan.nextInt();
      System.out.print("Enter the divisor  : ");
      div = scan.nextInt();
      System.out.println( num + " / " + div + " is " + (num/div) + " rem " + (num%div) );
    } 
    catch (ArithmeticException ex )
    { 
      System.out.println("You can't divide " + num + " by " + div);
    } 
    catch (Exception ex )
    { 
      System.out.println("Something went wrong." );
    }
   
    System.out.println("Good-bye" );
  }

}