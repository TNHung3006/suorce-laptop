/* MyHostToIP
   To find the IP address of the machine being used

   Syntax: java MyHostToIP 
*/

import java.net.*;

class MyHostToIP {

  public static void main (String[] args)  {
    try  {
        InetAddress  myaddr = InetAddress.getLocalHost();
        System.out.println(myaddr);
    }
    catch(UnknownHostException uhe) {
        System.out.println("Can't find this host address");
    }
  }
}  // MyHostToIP