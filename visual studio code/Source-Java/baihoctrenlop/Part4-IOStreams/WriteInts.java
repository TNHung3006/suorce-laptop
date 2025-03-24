import java.io.*;
class WriteInts
{

 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat" ;

   int value0   =   0, value1  = 1, 
       value255 = 255, valueM1 = -1;

   try
   {      
     DataOutputStream out = new DataOutputStream( new FileOutputStream( fileName  ) );

     out.writeInt( value0 );
     out.writeInt( value1 );
     out.writeInt( value255 );
     out.writeInt( valueM1 );
     out.close();
   }
   catch ( IOException iox )
   {
     System.out.println("Problem writing " + fileName );
   }
 }
}
