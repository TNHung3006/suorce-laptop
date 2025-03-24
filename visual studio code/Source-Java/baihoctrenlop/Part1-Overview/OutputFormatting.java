/**
 * @(#)OutputFormatting.java
 *
 *
 * @author PVNAMK19
 * @version 1.00 2007/12/13
 */

public class OutputFormatting {
        
    /**
     * Creates a new instance of <code>OutputFormatting</code>.
     */
    public OutputFormatting() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 15; int j = 7;
        
        float k = 0;
        //k = (float)(i/j);
        k = (float)(1.0*i/j);
        //k = 1.0*i/j;
        System.out.println ("k="+k);
        double h = 0;
        h = 1.0*i/j;
        //h = i/j*1.0;
        System.out.println ("h="+h);
    }
}
