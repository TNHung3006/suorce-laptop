import java.io.*;  //import all the classes defined in java.io

public class CopyFile {

	public static void main(String[] args) throws IOException {
                BufferedReader in=null;
		PrintWriter out=null;
		if (args.length != 2)
			System.out.println("Useage: Copyfile <source file> <target file>");
		else {
			in = new BufferedReader( new FileReader(args[0]));
                	out = new PrintWriter( new FileWriter(args[1]));
			int i = 0;
			String line = null;
			while(true) {
			   line = in.readLine();
			   if (line == null) break;
			   out.println(line);
			   i++;
			}

		       out.close();
		       System.out.println("file "+args[0]+" copied into file "+args[1]+" ("+i+" lines)");
		}
	}
}
		