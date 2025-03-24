/* IPToHost
   To find the hostname for a given IP address

   Syntax: java IPToHost n1.n2.n3.n4
*/  

import java.net.*;

class IPToHost {

  public static void main (String[] args)  {
    try  {
        InetAddress  hostname = InetAddress.getByName(args[0]);
        System.out.println(hostname.getHostName());
    }
    catch(UnknownHostException uhe) {
        System.out.println("Can't find " + args[0]);
    }
  }
}  // IPToHost
