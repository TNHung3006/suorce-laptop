/**
 * @(#)GPTB2.java
 *
 *
 * @author 
 * @version 1.00 2008/8/18
 */

public class GPTB2 {
        
    /**
     * Creates a new instance of <code>GPTB2</code>.
     */
    public GPTB2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console con = new Console();
        double a,b,c,x1,x2,delta;
        con.print("nhap vao gia tri a =");
        a = con.readInt();
        con.print("nhap vao gia tri b =");
        b = con.readInt();
        con.print("nhap vao gia tri c =");
        c = con.readInt();
        if (a == 0)
        	if (b ==0)
        		if (c==0)
        			con.println("Phuong trinh co vo so nghiem");
        		else con.println("PTVN");
        	else
        		con.println("Phuong trinh co nghiem don x = "+ -c/b);
        else{
        	delta = b*b - 4*a*c;
        	if (delta < 0)
        		con.println("PTVN");
        	else
        		if (delta == 0)
        			con.println("Phuong trinh co nghiem kep x1=x2="+-b/2/a);
        		else{
        			x1 = (-b - Math.sqrt(delta))/(2*a);
        			x2 = (-b + Math.sqrt(delta))/(2*a);
        			con.println("Phuong trinh co hai nghiem phan biet:");
        			con.println("x1 = " + x1);
        			con.println("x2 = " + x2);
        		}
        }
    }
}
