/**
 * @(#)TestDoWhile.java
 *
 *
 * @author PVNAMK19
 * @version 1.00 2007/12/13
 */
import java.io.*;
public class TestDoWhile {
        
    /**
     * Creates a new instance of <code>TestDoWhile</code>.
     */
    public TestDoWhile() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        boolean thoat = false;
        do{
        	System.out.print("Nhap vao mot so, 0 de dung:");
        	BufferedReader streami = new BufferedReader(
		    	new InputStreamReader(System.in));
		    String stemp = streami.readLine();
		    int i = Integer.parseInt(stemp);
		    if (i==0) thoat = true;
		    System.out.println ("i= " + i);
		    	
		    	
        } while (thoat == false);
    }
}
