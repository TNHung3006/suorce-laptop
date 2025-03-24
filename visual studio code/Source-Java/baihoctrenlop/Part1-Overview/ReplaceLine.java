public class ReplaceLine {


        public static void main(String[] args) {
            Console c = new Console();
       	c.print("Input the line : ");
	 	String x = c.readLine();
	 	c.print("Input search pattern : ");
		String y = c.readLine();
            c.print("Input replace pattern: ");
            String z = c.readLine();
		String s = "";
		while(true) {
			int i = x.indexOf(y);
			if (i == -1) break;
			s = s + x.substring(0,i) + z;
			x = x.substring(i+y.length());
		}
		s = s + x;
            c.println(s);
	}

}
		