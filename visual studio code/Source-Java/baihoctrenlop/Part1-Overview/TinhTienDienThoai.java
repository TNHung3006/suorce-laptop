/**
 * @(#)TinhTienDienThoai.java
 *
 *
 * @author 
 * @version 1.00 2008/10/28
 */

public class TinhTienDienThoai {
        
    /**
     * Creates a new instance of <code>TinhTienDienThoai</code>.
     */
    public TinhTienDienThoai() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console c = new Console();
        int sophut;
        long sotien = 27000;
        c.print("Nhap so phut:");
        sophut = c.readInt();
        if (sophut <= 200)
        	sotien = sotien + sophut*120;
        else 
        	if (sophut <= 400)
        		sotien = sotien + 200*120 + 80*(sophut - 200);
        	else 
        		sotien = sotien + 200*120 + 200*80 + 40*(sophut - 400);
		c.println("So tien phai tra: " + sotien);
    }
}
