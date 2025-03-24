/* DecomURL
   To decompose an URL 

   Syntax: java DecomURL url
*/  

import java.net.*;

public class DecomURL {

  public static void main (String[] args)  {
    try  {
        URL url = new URL(args[0]);
        System.out.println("URL is " + url);
        System.out.println("Protocol is " + url.getProtocol());
        System.out.println("Hostname is " + url.getHost());
        System.out.println("Port number is " + url.getPort());
        System.out.println("Pathname is " + url.getFile());
        System.out.println("Named anchor is " + url.getRef());
    }
    catch(MalformedURLException mue) {
        System.out.println(args[0] + " is not valid");
    }
  }
}  // DecomURL
