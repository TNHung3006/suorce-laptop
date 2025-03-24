import java.net.*;
import java.io.*;

public class UDPClockClient {

    public static void main(String[] args) throws IOException {
       
        if (args.length != 1) {
             System.out.println("Usage: java UDPCLockClient <hostname>");
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
			// get packets
	while(true) {
	   packet = new DatagramPacket(buf, buf.length);
	   socket.receive(packet);
	   		// display packet
	   String received = new String(packet.getData());
	   
	   System.out.println(received);

     	}
    }
        
}
