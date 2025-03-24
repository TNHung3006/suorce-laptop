import java.io.*;
class ReadInts
{
 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat" ;  long sum = 0;

   try
   {      
     DataInputStream instr = 
       new DataInputStream(
         new BufferedInputStream(
           new FileInputStream( fileName  ) ) );

     sum += instr.readInt();
     sum += instr.readInt();
     sum += instr.readInt();
     sum += instr.readInt();
     
     System.out.println( "The sum is: " + sum );
     instr.close();
   }
   catch ( IOException iox )
   {
     System.out.println("Problem reading " + fileName );
   }
 }
}