import java.net.*; 
import java.io.*; 
import java.util.*;  
public class DateServer {      
	public static void main(String args[]) throws Exception {  	  
      //If I don't want to care about exceptions I put throws Exception
         ServerSocket server = new ServerSocket(4444);
         while(true) {
                 System.out.println("Waiting for client...");
                 Socket client = server.accept();
                 System.out.println("Accepted from "+client.getInetAddress());
                 PrintWriter bo = new  PrintWriter(client.getOutputStream(),true);
    	         Date d = new Date();
   		 bo.println(d.toString());
		 client.close();
         }
    }
 } 