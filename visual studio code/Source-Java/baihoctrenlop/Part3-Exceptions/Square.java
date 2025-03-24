import java.util.* ;

public class Square
{

  public static void main ( String[] a ) 
  {
    Scanner scan = new Scanner( System.in  );
    int num ;

    System.out.print("Enter an integer: ");
    num = scan.nextInt();      
    System.out.println("The square of " + num + " is " + num*num );
  }
}
