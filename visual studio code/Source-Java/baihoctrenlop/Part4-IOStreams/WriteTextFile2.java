import java.io.*;

class WriteTextFile2
{

  public static void main ( String[] args ) 
  {
    String fileName = "reaper.txt" ;

    try
    {  
      // append characters to the file
      FileWriter writer = new FileWriter( fileName, true );

      writer.write( "Alone she cuts and binds the grain,\n"  );  
      writer.write( "And sings a melancholy strain;\n"  );  
      writer.write( "O listen! for the Vale profound\n" );  
      writer.write( "Is overflowing with the sound.\n\n"  );  

      writer.close();
    }
    catch ( IOException iox )
    {
      System.out.println("Problem writing " + fileName );
    }
  }
}
