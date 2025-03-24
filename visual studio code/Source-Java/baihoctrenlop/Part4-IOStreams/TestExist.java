import java.io.*;
class TestExist
{

  public static void main ( String[] args ) 
  {
    String pathName = "notLikely.txt" ;

    File   test = new File( pathName );

    if ( test.exists() )
      System.out.println( "The file " + pathName + " exists." );
    else
      System.out.println( "The file " + pathName + " Does Not exist." );
  }

}
