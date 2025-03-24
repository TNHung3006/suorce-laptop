//An Example of the InetAddress class

import java.io.*;
import java.net.*;

 public class InetExample {
      public static void main(String[] args) throws IOException {

	     try {
                InetAddress me = InetAddress.getLocalHost();
                System.out.println("My name : "+me.getHostName());
                System.out.println("My IP : "+me.getHostAddress());
                System.out.println("My class : "+iPClass(me.getAddress()));
	     }
	     catch (UnknownHostException e) {
                System.out.println("I didn't find mysef !!!");
	     }
	}
	
	public static char iPClass(byte[] ip) {
		int byteMayor = 0xff & ip[0];
		if (byteMayor < 128 ) return 'A';
		if (byteMayor < 192 ) return 'B';
		if (byteMayor < 224 ) return 'C';
		if (byteMayor < 240 ) return 'D';
		return 'E';
        }
  }
