/**
 * @(#)TinhSoNgay.java
 *
 *
 * @author 
 * @version 1.00 2008/10/28
 */

public class TinhSoNgay {
        
    /**
     * Creates a new instance of <code>TinhSoNgay</code>.
     */
    public TinhSoNgay() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console c = new Console();
        int thang,nam;
        c.print("Nhap thang = ");
        thang = c.readInt();
        switch (thang){
        	case 4:
        	case 6:
        	case 9:
        	case 11:
        		c.println("So ngay la: 30");
        		break;
        	case 1:
        	case 3:
        	case 5:
        	case 7:
        	case 8:
        	case 10:
        	case 12:
        		c.println("So ngay la: 31");
        		break;
        	case 2:
        		c.print("Nhap nam = ");
        		nam = c.readInt();
        		if ( (nam % 400 == 0) || ( (nam % 4 ==0) && (nam % 100 != 0)))
        			c.println("Co 29 ngay (do la nam nhuan)");
        		else c.println("Co 28 ngay");
        		break;
        	default:
        		c.println("Ban nhap thang khong hop le");
        }
    }
}
