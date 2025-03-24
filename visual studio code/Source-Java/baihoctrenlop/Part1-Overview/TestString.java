/**
 * @(#)TestString.java
 *
 *
 * @author PVNAMK19
 * @version 1.00 2007/12/1
 */

public class TestString {
        
    /**
     * Creates a new instance of <code>TestString</code>.
     */
    public TestString() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestString ts = new TestString();
        System.out.println (ts.valorEntero("12331"));
    }
    int valorEntero(String x) {
	    int valor = 0;
	    for(int i = 0; i < x.length(); i++)
		   valor = valor*10 + (x.charAt(i)- '0');
	    return valor;
	 }

}
