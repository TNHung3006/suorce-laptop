import java.io.*;
class ReadBuggyLongs
{
 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat" ;   long sum = 0;

   try
   {      
     DataInputStream instr = 
       new DataInputStream(
         new BufferedInputStream(
           new FileInputStream( fileName  ) ) );

     sum += instr.readLong();
     sum += instr.readLong();
     System.out.println( "The sum is: " + sum );
     instr.close();
   }
   catch ( IOException iox )
   {
     System.out.println("Problem reading " + fileName );
   }
 }
}
