import java.io.*;
class TestExist2
{

  public static void main ( String[] args ) 
  {
    String pathName;
    
    if ( args.length == 1 ) 
      pathName = args[0];
    else
      pathName = "";

    File   test = new File( pathName );

    if ( test.exists() )
      System.out.println( "The file " + pathName + " exists." );
    else
      System.out.println( "The file " + pathName + " Does Not exist." );
  }

}
