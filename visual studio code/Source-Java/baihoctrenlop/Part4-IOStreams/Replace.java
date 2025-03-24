import java.io.*;  //import all the classes defined in java.io

public class Replace {


        public static String replace(String x, String y, String z) {
		String s = "";
		while(true) {
			int i = x.indexOf(y);
			if (i == -1) break;
			s = s + x.substring(0,i) + z;
			x = x.substring(i+y.length());
		}
		s = s + x;
                System.out.println(s);
		return s;
	}

	public static void main(String[] args) throws IOException {
                BufferedReader in=null;
		PrintWriter out=null;
		if (args.length != 4)
			System.out.println("Useage: Replace <source file> <original string> <target file> <new string>");
		else {
			in = new BufferedReader( new FileReader(args[0]));
                	out = new PrintWriter( new FileWriter(args[2]));
			String original = args[1];
			String thenew = args[3];

			int i = 0;
			String line = null;
			while(true) {
			   line = in.readLine();
			   if (line == null) break;
			   String modified = replace(line, original, thenew);
			   out.println(modified);
			   i++;
			}

		       out.close();
		       System.out.println("file "+args[0]+" copied into file "+args[2]+" ("+i+" lines)");
		}
	}
}
		