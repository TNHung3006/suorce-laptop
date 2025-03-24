/**
 * @(#)VietHoa.java
 *
 *
 * @author 
 * @version 1.00 2009/10/13
 */
import java.io.*;
public class VietHoa {
        
    /**
     * Creates a new instance of <code>VietHoa</code>.
     */
    public VietHoa() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader streami = new BufferedReader(
    new InputStreamReader(System.in));
    System.out.println ("Nhap vao mot xau:");
    String s = streami.readLine();
    s = s.toUpperCase();
    System.out.println ("Xau sau khi viet hoa:");
    System.out.println (s);
    /*
    StringBuffer s1 = new StringBuffer(s);
    for (int i = 0; i < s1.length();i++){
    	char ch = s1.charAt(i);
    	if ((ch >='a') && (ch <= 'z'))
    	{
    		ch = (char)((int)ch -32 );
    		s1.setCharAt(i,ch);
    	}
    }	
 	System.out.println ("Xau sau khi viet hoa:");
    s = s1.toString();
    System.out.println (s1);
*/
    
    }
}
