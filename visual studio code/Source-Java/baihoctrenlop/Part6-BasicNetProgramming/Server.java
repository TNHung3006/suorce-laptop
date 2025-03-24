import java.net.*;
import java.io.*;
public class Server {      
    public static void main(String args[]) throws Exception{  	  
         ServerSocket server = new ServerSocket(4447);
         //while(true) {
            System.out.println("Waiting for client...");
            Socket client = server.accept();
		 	PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		 	BufferedReader in = new  BufferedReader(new 
		             InputStreamReader(client.getInputStream()));
		             
		    //Nhan mot xau tu Client
		    String line = in.readLine();
		    
		    //Xu ly xau theo yeu cau cua bai
		    String kq = new String(line);
		    out.println(kq);
		    
		    out.close();
		    in.close();
	    	client.close();
	    	
         //}
    }
 } 