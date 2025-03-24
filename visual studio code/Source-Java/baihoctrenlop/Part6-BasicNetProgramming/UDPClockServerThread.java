import java.io.*;
import java.net.*;
import java.util.*;

public class UDPClockServerThread extends Thread {

     int port;
     InetAddress addr; 

	UDPClockServerThread(InetAddress a, int p) {  
		port = p;
		addr = a;   
	}

	public void run()   {

		
		byte[] buf = new byte[256];
		
            try {
		DatagramSocket socket = new DatagramSocket();
            while (true) {
                  String dString = null;
		      dString = new Date().toString();
               
                  buf = dString.getBytes();
		      DatagramPacket packet2 = 
                           new DatagramPacket(buf, buf.length, addr, port);
                  socket.send(packet2);
			try { Thread.sleep(1000);
			} catch(InterruptedException e) { }
                 
             }
       } catch (Exception e) {}
   }
}
