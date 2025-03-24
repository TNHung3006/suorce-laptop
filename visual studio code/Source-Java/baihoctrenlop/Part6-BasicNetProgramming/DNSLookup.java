import java.io.*;
import java.net.*;

 public class DNSLookup {
      public static void main(String[] args) throws IOException {

	     
	     BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
         String name = "not-name";
	     try {
                while (true) {
                   System.out.print("host name?");System.out.flush();
                   name = kbd.readLine();
				   if (name == null || name.equals("end"))
                        return;
                   else {
                        System.out.println("DNS lookup for " +name);
                        InetAddress remote = InetAddress.getByName(name);
                        System.out.println("The IP : "+remote.getHostAddress());
                        System.out.println("The class : "+iPClass(remote.getAddress()));
		   		  }
                } 
	     } catch (UnknownHostException e) {
                System.out.println("Address of "+name+"not found !!!");
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
