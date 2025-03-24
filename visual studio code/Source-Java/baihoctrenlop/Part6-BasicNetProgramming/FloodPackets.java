import java.io.*;
import java.net.*;
import java.util.*;

public class FloodPackets {

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
	    System.out.println("I´ve got a packet from "+address+"---"+port);
	    System.out.println("Now I will overflow him with packet ;-)");

            for (int i=1; i< 200; i++) {
                   String dString = null;
		   if (i == 199)
			dString = "end";
		   else
                        dString = i+"--"+(new Date().toString());
                  System.out.println("Packet "+i+" sent");
                  buf = dString.getBytes();
		      DatagramPacket packet2 = 
                           new DatagramPacket(buf, buf.length, address, port);
                  socket.send(packet2);
		  try {  Thread.currentThread().sleep(300); } catch (InterruptedException e) {}
             }

          }
       } catch (IOException e) {}
   }
}
