import java.io.*;
class CopyBytesWithErrorChecking
{
  public static void main ( String[] args ) 
  {
    DataInputStream  instr;
    DataOutputStream outstr;

    if ( args.length != 3 || !args[1].toUpperCase().equals("TO") )
    {
      System.out.println("java CopyBytesWithErrorChecking source to destination");
      return;
    }

    File inFile  = new File( args[0] );
    File outFile = new File( args[2] );

    if ( outFile.exists() )
    {
      System.out.println( args[2] + " already exists");
      return;
    }

    if ( !inFile.exists() )
    {
      System.out.println( args[0] + " does not exist");
      return;
    }

    try
    {
      instr = 
        new DataInputStream(
          new BufferedInputStream(
            new FileInputStream( inFile )));
      outstr = 
        new DataOutputStream(
          new BufferedOutputStream(
            new FileOutputStream( outFile  )));

      try
      {
        int data;
        while ( true )
        {
          data = instr.readUnsignedByte() ;
          outstr.writeByte( data ) ;
        }
      }
      catch ( EOFException  eof )
      {
        outstr.close();
        instr.close();
        return;
      }
    }

    catch ( FileNotFoundException nfx )
    {
      System.out.println("Problem opening files" );
    }
    catch ( IOException iox )
    {
      System.out.println("IO Problems" );
    }

  }
}
