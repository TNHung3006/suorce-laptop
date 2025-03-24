import java.io.*;
public class ReadANumber {
	public static void main(String args[ ])  throws IOException {
	   BufferedReader inKbd = new BufferedReader(
					new InputStreamReader(System.in));
       String inputLine;
       System.out.print("I am Tricker, enter your number ! ");
       inputLine = inKbd.readLine();
       int yourNumber = Integer.parseInt( inputLine );
       System.out.println("My number is "+ (yourNumber +1 )+" I win !"); 
	}
} 
