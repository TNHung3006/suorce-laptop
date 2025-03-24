import java.io.*;
import java.net.*;
public class Client {
   public static void main(String[] args) throws Exception{
       Socket dataSocket = new Socket(args[0],4447);

       BufferedReader in = new BufferedReader(new 
		    InputStreamReader(dataSocket.getInputStream()));
		 
       PrintWriter out = new PrintWriter(dataSocket.getOutputStream(),true);

   	   BufferedReader kbd = new BufferedReader(
   			new InputStreamReader(System.in));
       
	   System.out.println("Nhap vao mot xau:");
	   String s = kbd.readLine();	
	   	
	   out.println(s);
	   
	   System.out.println ("Ket qua tu server: "+in.readLine());	
      
       in.close();
       out.close();
       dataSocket.close();
    }
 }
