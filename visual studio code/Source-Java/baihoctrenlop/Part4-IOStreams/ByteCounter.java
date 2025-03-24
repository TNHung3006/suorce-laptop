import java.io.*;
class ByteCounter
{
  public static void main ( String[] args ) throws IOException
  {
    String fileName = "mixedTypes.dat" ;

    DataOutputStream dataOut = new DataOutputStream(
        new BufferedOutputStream(
        new FileOutputStream( fileName  ) ) );

    dataOut.writeInt( 0 );
    System.out.println( dataOut.size()  + " bytes have been written.");

    dataOut.writeDouble( 12.45 );
    System.out.println( dataOut.size()  + " bytes have been written.");

    dataOut.close();
  }
}
