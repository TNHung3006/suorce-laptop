/**
 * @(#)SwapIntFail.java
 *
 *
 * @author 
 * @version 1.00 2008/10/22
 */

public class SwapIntFail {
        
    /**
     * Creates a new instance of <code>SwapInt</code>.
     */
    public SwapIntFail() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a,b;
        a = new Integer(5);
        b = new Integer(6);
        swap(a,b);
        System.out.println ("a = " +a);
        System.out.println ("b = "+ b);
    }
    public static void swap(Integer a, Integer b){
    	Integer c = a;
    	a = b;
    	b = c;
    	System.out.println ("In swap method a = "+a);
    	System.out.println ("In swap method b = " +b);
    }
}
