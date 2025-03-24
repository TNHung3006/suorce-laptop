import java.io.*;
import java.net.*;

 public class DateClient2 {
   public static void main(String[] args) throws IOException {
       Socket dateSocket = null;
       BufferedReader in = null;
       try {
           dateSocket = new Socket(args[0],4444 );

           in = new BufferedReader(new 
		             InputStreamReader(dateSocket.getInputStream()));
       } catch (UnknownHostException e) {
           System.err.println("Don't know about host: "+ args[0]);
           System.exit(1);
       } catch (IOException e) {
           System.err.println("Couldn't get I/O for the connection to: "+args[0]);
           System.exit(1);
       }
       String line = in.readLine();
       System.out.println("date received: " + line);
       in.close();
       dateSocket.close();
    }
 }
