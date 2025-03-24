import java.net.*;
import java.io.*;
import java.util.*;

public class EchoServer {

    public static void main(String args[]) throws Exception { 
	//If I don't want to care about exceptions I put throws Exception
        ServerSocket server = new ServerSocket(4447);
       
        System.out.println("Waiting for client...");
        Socket client = server.accept();
        System.out.println("Accepted from "+client.getInetAddress());
        PrintWriter out = new  PrintWriter(client.getOutputStream(),true);
	BufferedReader in = new  BufferedReader(new 
		             InputStreamReader(client.getInputStream()));
		
	while (true) {
		String line = in.readLine();
		if (line.equals("end")) break;
		out.println(line);
	}
		
	client.close();
   }
}
