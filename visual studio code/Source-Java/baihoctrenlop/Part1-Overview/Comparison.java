public class Comparison {

    public static boolean equal1(String x, String y) {
        if (x.length() != y.length() ) 
               return false;

        for(int i = 0; i < x.length(); i ++)
            if (x.charAt(i) != y.charAt(i))
		return false;
	return true;
    }

    public static boolean equal2(String x, String y) {
	 if( x.length() == y.length() && x.indexOf(y) == 0) 
		return true;
       else
            return false;
    }

    public static void main(String args[]) {
       Console c = new Console();
	 while (true) {
         c.print("Input the first String : ");
	   String first = c.readLine();
	   c.print("Input the second String : ");
         String second = c.readLine();
         c.println("Comparison 1 "+equal1(first,second)+" Comparison 2 "+
                           equal2(first,second));
	 }
   }
}
