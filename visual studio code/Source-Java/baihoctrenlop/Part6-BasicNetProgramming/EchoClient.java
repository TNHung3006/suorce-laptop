import java.io.*;
import java.net.*;

public class EchoClient {
      public static void main(String[] args) throws IOException {
      	Socket echoSocket = null;
      	PrintWriter out = null;
      	BufferedReader in = null;
      	int PORT = 7;
      	if (args.length < 1) {
      		System.out.println("Use: java EchoClient hostname <port>");
      		System.exit(1);
      	}
      	if (args.length == 2)
      		PORT = Integer.parseInt(args[1]);
      	try {
      		echoSocket = new Socket(args[0],PORT);
      		out = new PrintWriter(echoSocket.getOutputStream(), true);
      		in = new BufferedReader(new 
			InputStreamReader(echoSocket.getInputStream()));
			} catch (UnknownHostException e) {
				System.err.println("Don't know about host: "+ args[0]);
				System.exit(1);
			} catch (IOException e) {
				System.err.println("Couldn't get I/O for the connection to: "+args[0]);
				System.exit(1);
			}
		BufferedReader stdIn = new BufferedReader(new 
					InputStreamReader(System.in));
		String userInput;
		System.out.println("Connected to "+args[0]);
		while (true) {
			userInput = stdIn.readLine();
			out.println(userInput);
			if (userInput.equals("end")) break;
			System.out.println("echo: " + in.readLine());
		}
		out.println(userInput);
		out.close();
		in.close();
		stdIn.close();
		echoSocket.close();
	}
}

/*
	public PrintWriter(OutputStream out,boolean autoFlush)
	Creates a new PrintWriter from an existing OutputStream.
	This convenience constructor creates the necessary intermediate
	 OutputStreamWriter, which will convert characters into bytes using
	 the default character encoding. 

	Parameters:
		out - An output stream
		autoFlush - A boolean; if true, the println, printf,
		 or format methods will flush the output buffer

*/