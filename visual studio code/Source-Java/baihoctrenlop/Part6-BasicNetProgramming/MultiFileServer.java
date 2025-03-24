import java.net.*;
import java.io.*;

public class MultiFileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        boolean listening = true;

        try {
            serverSocket = new ServerSocket(4445);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4445.");
            System.exit(-1);
        }

        while (listening) {
	    System.out.println("waiting for a new client");
	    Socket cs = serverSocket.accept();
	    MultiFileThread mft = new MultiFileThread(cs);
	    System.out.println("client request, creating a thread...");
	    mft.start();
	  }

        serverSocket.close();
    }
}
