import java.io.*;
import java.util.Scanner;

class CreateFile
{
  public static void main ( String[] args ) 
  {

    // Get filename and create the file
    FileWriter writer = null;
    Scanner scan = new Scanner( System.in );
    String fileName = "";
    System.out.print("Enter Filename-->");  
    
    try
    {
      fileName = scan.next();
      writer = new FileWriter( fileName );
    }
    catch  ( IOException iox )
    {
      System.out.println("Error in creating file");
      return;
    }
      
    // Write the file.
    try
    {  
      writer.write( "Behold her, single in the field,\n"  );  
      writer.write( "Yon solitary Highland Lass!\n"  );  
      writer.write( "Reaping and singing by herself;\n" );  
      writer.write( "Stop here, or gently pass!\n"  );  
      writer.close();
    }
    catch ( IOException iox )
    {
      System.out.println("Problem writing " + fileName );
    }
  }
}
