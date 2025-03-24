public class ProgrammX {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	//5,  7,  3,  8,  10,  2,  3,  -1

        int a = 0, b = 0, sum= 0, num;
        Console c = new Console();
        while (true) {
            num = c.readInt();
            if (num == -1) break;  // breaks the loop
            if (num %2 == 0) {
                sum = sum +num;
                a = a+1;
            } else {
                sum = sum + num;
                b = b + 1;
            }
        }
	c.println("a=" +a);
	c.println("b=" +b);
	c.println("sum=" +sum);
        
    }
    
}