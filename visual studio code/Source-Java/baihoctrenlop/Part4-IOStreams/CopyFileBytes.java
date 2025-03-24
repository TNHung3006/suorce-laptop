import java.io.*;  
import java.net.*;    
public class CopyFileBytes { 
    public static void main(String[] args)  throws Exception { 
           FileInputStream inFile = new FileInputStream(args[0]);
  	   FileOutputStream outFile =  new FileOutputStream(args[1]); 
  	   System.out.println("Copying "+args[0]+" into "+args[1] ); 
 	   int b;
           byte ab[] = new byte[1024];
           while (( b= inFile.read(ab,0,1024) ) != -1)  {
           	   outFile.write(ab,0,b);
	      }
  	      inFile.close(); outFile.close();
  	 }
    }
  		  
