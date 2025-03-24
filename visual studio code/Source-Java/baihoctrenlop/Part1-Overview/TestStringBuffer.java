/**
 * @(#)Tam1.java
 *
 *
 * @author 
 * @version 1.00 2007/11/27
 */

public class TestStringBuffer {
        
    /**
     * Creates a new instance of <code>Tam1</code>.
     */
    public TestStringBuffer() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer sb = new StringBuffer("Truong");
        sb.append(" Dai hoc Thuy San");  //sb : "Truong Dai hoc Thuy San"
        System.out.println (sb);
        sb.delete(7,11);   		               //sb : "Truong hoc Thuy San"
        System.out.println (sb);
        sb.replace(11,19,"Nha Trang");         //sb : "Truong hoc Nha Trang"
        System.out.println (sb);
        sb.insert(7,"Dai ");                   //sb : "Truong Dai hoc Nha Trang"
        System.out.println (sb);

    }
}
