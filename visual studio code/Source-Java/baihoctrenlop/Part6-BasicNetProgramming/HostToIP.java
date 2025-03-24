/* HostToIP
   To find the IP address of a given Hostname

   Syntax: java HostToIP hostname
*/  

import java.net.*;

class HostToIP {

  public static void main (String[] args)  {
    try  {
        InetAddress  ipaddr = InetAddress.getByName(args[0]);
        System.out.println(ipaddr);
    }
    catch(UnknownHostException uhe) {
        System.out.println("Can't find " + args[0]);
    }
  }
}  // HostToIP
