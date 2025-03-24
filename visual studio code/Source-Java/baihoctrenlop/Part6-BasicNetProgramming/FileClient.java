
import java.io.*;
import java.net.*;

public class FileClient {
      public static void main(String[] args) throws Exception {

             Socket elSocket = null;
             
             try {
		 
                elSocket = new Socket(args[0], 4445);

		BufferedReader inKbd = new BufferedReader( 
					  new InputStreamReader(System.in));
		System.out.println("Name of file to ask for "+args[0]);
		String fileName = inKbd.readLine();

		 
                PrintWriter outSocket = new PrintWriter(  
			new OutputStreamWriter(elSocket.getOutputStream()));

	        outSocket.println(fileName);
		outSocket.flush();

		//open file for writing
 		FileOutputStream outFile = new FileOutputStream(fileName);
	        System.out.println("Reading from socket and writing in "+fileName);

		//open socket for reading
                InputStream inSocket = elSocket.getInputStream();

	          int b; 
	          byte ab[] = new byte[1024];
	          while ((b= inSocket.read(ab,0,1024) ) != -1)  
		     outFile.write(ab,0,b);
		  System.out.println("Ready !");
	      } catch (Exception e) { System.out.println("Problems !!! "+e);}
	}
}
	     

