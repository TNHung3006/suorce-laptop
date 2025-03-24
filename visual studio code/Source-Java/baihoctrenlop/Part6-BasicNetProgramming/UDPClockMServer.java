import java.io.*;
import java.net.*;
import java.util.*;

public class UDPClockMServer {

  static public void main(String args[]) {

     DatagramSocket socket = null;
     BufferedReader in = null;
     
     try {
        socket = new DatagramSocket(4445);

        while (true) {

            byte[] buf = new byte[256];

            System.out.println("waiting for request ....");
            DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
            socket.receive(packet1);  				//this will block the execution 
		InetAddress address = packet1.getAddress();
            int port = packet1.getPort();
		System.out.println("I´ve got a request from "+address+"---"+port);
		System.out.println("Now I will send him the time REALLY forever");
		UDPClockServerThread pp = new UDPClockServerThread(address,port);
		pp.start();
	 }
     } catch (IOException e) {}
   }
}
