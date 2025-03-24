import java.net.*;
import java.io.*;

public class MultiFileThread extends Thread {
    private Socket socket;
    
    public MultiFileThread(Socket s) {
      	socket = s;
    }

    public void run() {

	try {
	     System.out.println("reading the name of the file");
	     InputStreamReader im = new 
			InputStreamReader(socket.getInputStream());
	     BufferedReader inSocket = new BufferedReader( im );

	     String fileName = inSocket.readLine();

	     System.out.println("opening the file ");
	     FileInputStream inFile = new FileInputStream(fileName);
	     OutputStream outSocket = socket.getOutputStream();
 	     System.out.println("transmission begins ... ");

	     int b, i=0;
             byte ab[] = new byte[1024];
	     while ((b= inFile.read(ab,0,1024) ) != -1)  {
		       outSocket.write(ab,0,b);
	      }
	      outSocket.close(); 
	      inFile.close(); 
              inSocket.close();
	      System.out.println("transmission ends ... ");

	   }catch (Exception e) {System.out.println("problems...."+e);}
    }
}
