import java.io.*;
import java.util.Scanner;
class PowerTable
{
  public static void main ( String[] args ) 
  {
    // Get filename and create the file
    PrintWriter out = null;
    Scanner scan = new Scanner( System.in );
    String fileName = "";

    System.out.print("Enter Filename-->");  
    try
    {
      fileName = scan.next();
      
      // create the PrintWriter and enable automatic flushing
      out = new PrintWriter( new BufferedWriter( new FileWriter( fileName )), true );
    }
    catch ( IOException iox )
    {
      System.out.println("Error in creating file");
      return;
    }
      
    // Write out the table.
    int value = 1;
    out.println( "Power\tValue"  );
    for ( int pow=0; pow<=20; pow++ )
    {
      out.print  ( pow   );  
      out.print  ( '\t'  );  
      out.println(  value  );  
      value = value*2;
    }
    out.close();
   
  }
}
