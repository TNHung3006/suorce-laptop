import java.io.*;
public class TestObjectInputStream {
	public static void main(String args[]) {
		Record r;
		try {
			FileInputStream fin = new FileInputStream(args[0]);
			ObjectInputStream in = new ObjectInputStream(fin);
			while (true) {
				r = (Record) in.readObject();
				System.out.println(r);
			}
		} catch (EOFException e) {
			System.out.println("No more records");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to create object");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}