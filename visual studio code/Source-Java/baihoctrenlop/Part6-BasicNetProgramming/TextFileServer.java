import java.io.*;
import java.net.*;

 public class TextFileServer {
      public static void main(String[] args) throws IOException {

             Socket cs = null;
	     ServerSocket ss = new ServerSocket(4445);
             
	     do { //INFINITE LOOP attending clients
	         System.out.println("waiting for a client");
	         cs = ss.accept();
                 System.out.println("Client request received from "+cs.getInetAddress());

		   //reading the name of the file
	         BufferedReader inSocket = new BufferedReader( 
				new InputStreamReader(cs.getInputStream()));
		   String fileName = inSocket.readLine();

	         //opening the file (for text file only)
		   BufferedReader inFile = new BufferedReader(
					new FileReader(fileName));
		   PrintWriter outSocket = new PrintWriter(cs.getOutputStream());
		   String line;
		   System.out.println("transmition begins...");
		   while (true) {
		      line = inFile.readLine();
		      if (line == null) 
			  break;
		      
                      outSocket.println(line);
		   }
	         outSocket.close(); inFile.close(); inSocket.close();
		 System.out.println("transmition ends...");

	     } while (true);
	}
  }
		 
