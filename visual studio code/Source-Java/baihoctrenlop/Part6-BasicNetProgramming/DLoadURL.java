/* DLoadURL
   To download a text file via a URL 

   Syntax: java DLoadURL url
*/  

import java.net.*;
import java.io.*;

public class DLoadURL {

  public static void main (String[] args)  {
    try  {
        URL url = new URL(args[0]);
        try {
            String dataline;
            BufferedReader src = 
               new BufferedReader(new InputStreamReader(url.openStream()));

            while ((dataline = src.readLine()) != null) 
                System.out.println(dataline);
        }  // end try
        catch(Exception e)  {
            System.out.println(e);
        }
    }  // end try
    catch(MalformedURLException mue) {
        System.out.println(args[0] + " is not valid");
    }  
  }  
}  // DLoadURl
