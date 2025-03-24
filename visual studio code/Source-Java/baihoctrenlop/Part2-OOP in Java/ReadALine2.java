import java.io.*; 
public class ReadALine2 {
	public static void main(String args[ ]) throws IOException {
	   DataInputStream stream = new DataInputStream(System.in);
	   System.out.print("Please enter your name: ");
	   String inputLine = stream.readLine();
       	   System.out.println("Hajimemashite,"+ inputLine); 
	}
} 
