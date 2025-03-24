import java.io.*;
public class ReadALine {
	public static void main(String args[ ]) throws IOException {     
		BufferedReader inKbd = new BufferedReader(
					new InputStreamReader(System.in));
	       String inputLine;
               System.out.print("Please enter your name: ");
	       inputLine = inKbd.readLine();			
               System.out.println("Hajimemashite,"+ inputLine); 
	}
} 
