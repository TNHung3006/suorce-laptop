import java.io.*;
class WriteTextFile3
{
  public static void main ( String[] args ) 
  {
    String fileName = "reaper.txt" ;
    PrintWriter print = null;

    try
    {       
      print = new PrintWriter( new BufferedWriter( new FileWriter( fileName  ) ) );
    }
    catch ( IOException iox )
    {
      System.out.println("Problem writing " + fileName );
    }

    print.println( "No Nightingale did ever chaunt"  );  
    print.println( "More welcome notes to weary bands"  );  
    print.println( "Of travellers in some shady haunt," );  
    print.println( "Among Arabian sands."  );  

    print.close();
  }
}
