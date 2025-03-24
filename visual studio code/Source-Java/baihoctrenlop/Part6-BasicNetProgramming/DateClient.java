import java.io.*;
import java.net.*;

public class DateClient {

   public static void main(String[] args) throws IOException {
       Socket dateSocket = null;
       BufferedReader in = null;
       int PORT = 13;

       if (args.length < 1) {
		System.out.println("Use: DateClient hostname <port>");
		System.exit(1);
       }
       if (args.length == 2)
	   PORT = Integer.parseInt(args[1]);
       try {
           dateSocket = new Socket(args[0],PORT);
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
