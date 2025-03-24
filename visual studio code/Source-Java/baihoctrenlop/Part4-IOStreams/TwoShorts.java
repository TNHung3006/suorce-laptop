import java.io.*;
class TwoShorts
{
  public static void main ( String[] args ) throws IOException
  {
    String fileName = "mixedTypes.dat" ;

    DataOutputStream dataOut = new DataOutputStream(
        new BufferedOutputStream(
        new FileOutputStream( fileName  ) ) );

    dataOut.writeShort( 0 );
    dataOut.writeShort( 0 );

    dataOut.writeDouble( 12.45 );

    dataOut.close();
  }
}
