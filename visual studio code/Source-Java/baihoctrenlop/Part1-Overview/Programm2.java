public class Programm2 {
   public static void main(String args[]) {
		Console c = new Console();
		c.print("Hello, what is your name ?");
		String name = c.readLine();
		c.print("When were you born ? (Year) ");
		int year = c.readInt();
		c.println(name+", you are about "+
			(2007-year)+" years old ");
   }
}
