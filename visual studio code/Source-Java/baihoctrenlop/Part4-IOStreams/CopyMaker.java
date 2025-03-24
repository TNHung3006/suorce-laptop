import java.io.*;

class CopyMaker
{
  String sourceName, destName;
  BufferedReader source;
  PrintWriter dest;
  String line;

  CopyMaker ( String sourceName, String destName )
  {
    this.sourceName = sourceName;
    this.destName   = destName;
  }

  private boolean openFiles()  // return true if files open, else false
  {
    // open the source
    try
    {      
      source = new BufferedReader(new FileReader( sourceName ));
    }
    catch ( IOException iox )
    {
      System.out.println("Problem opening " + sourceName );
      return false;
    }
    // open the destination
    try
    {      
      dest = new PrintWriter( new BufferedWriter(new FileWriter( destName )) );
    }
    catch ( IOException iox )
    {
      System.out.println("Problem opening " + destName );
      return false;
    }
    return true;
  }

  private void copyFiles()   
  {
    try
    {      
      line = source.readLine();
      while ( line != null )
      {
        dest.println(line);
        line = source.readLine();
      }
    }
    catch ( IOException iox )
    {
      System.out.println("Problem reading or writing" );
    }
  }

  private void closeFiles()   
  {
    // close the source
    try
    {      
      source.close();
    }
    catch ( IOException iox )
    {
      System.out.println("Problem closing " + sourceName );
    }
    // close the destination
    dest.close();
    //The close() method of PrintWriter does not throw an exception. 

  }

  public static void main ( String[] args ) 
  {
    if ( args.length == 3 && args[1].toUpperCase().equals("TO") )
    {
      CopyMaker cp = new CopyMaker( args[0], args[2] );
      if ( cp.openFiles() )
      {
        cp.copyFiles() ; 
        cp.closeFiles() ;
       }
    }
    else
      System.out.println("java CopyMaker source to destination");
  }

}
