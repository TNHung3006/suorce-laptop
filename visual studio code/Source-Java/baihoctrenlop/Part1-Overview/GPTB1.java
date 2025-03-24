/**
 * @(#)GPTB1.java
 *
 *
 * @author 
 * @version 1.00 2008/8/18
 */

public class GPTB1 {
        
    /**
     * Creates a new instance of <code>GPTB1</code>.
     */
    public GPTB1() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console con = new Console();
        double a,b,x;
        con.print("nhap vao gia tri a=");
        a = con.readInt();
        con.print("nhap vao gia tri b=");
        b = con.readInt();
        if (a==0)
        	if (b == 0)
        		con.println("Phuong trinh co vo so nghiem");
        	else con.println("Phuong trinh vo nghiem");
        else {
        	x = -b/a;
        	con.println("Phuong trinh co nghiem x = " +x);
        	
        }
         
    }
}
