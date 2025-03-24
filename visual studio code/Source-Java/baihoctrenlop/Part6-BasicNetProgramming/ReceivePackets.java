import java.io.*;
import java.net.*;
import java.util.*;

public class ReceivePackets {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
             System.out.println("Usage: java ReceivePackets <hostname>");
             return;
        }
			// get a datagram socket
        DatagramSocket socket = new DatagramSocket();
			// send request
	byte[] buf = new byte[256];
	InetAddress address = InetAddress.getByName(args[0]);
	DatagramPacket packet = 
        new DatagramPacket(buf, buf.length, address, 4445);
	socket.send(packet);
	System.out.println("request sent, waiting for Datagrams");
			// get packets
	while(true) {
	   packet = new DatagramPacket(buf, buf.length);
	   socket.receive(packet);
	   		// display packet content
	   String received = new String(packet.getData());
	   System.out.println("Got : " + received);
           if (received.indexOf("end") == 0) break;
	}
	socket.close();
    }
}
