import java.io.*;
class WriteDoubles
{
  public static void main ( String[] args ) throws IOException
  {
    String fileName = "doubleData.dat" ;

    DataOutputStream out = new DataOutputStream(
        new BufferedOutputStream(
        new FileOutputStream( fileName  ) ) );

    out.writeDouble( 0.0 );
    out.writeDouble( 1.0 );
    out.writeDouble( 255.0 );
    out.writeDouble( -1.0 );

    out.close();
  }
}
