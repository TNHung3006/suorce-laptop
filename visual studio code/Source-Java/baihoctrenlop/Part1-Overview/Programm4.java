public class Programm4 {

	public static void main(String args[]) {
		Console x = new Console();
		x.print("Type in radius :");
		double r = x.readDouble();
		double perimeter = 2*Math.PI*r;
		double area = Math.PI*Math.pow(r,2);
		x.println("The area is: "+area);
		x.println("The perimeter is: "+perimeter);
	}
}